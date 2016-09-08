package ru.serg.Storages;

import ru.serg.Base;
import ru.serg.SimpleArray;
import ru.serg.Store;

/**
 * Created by Serg on 07.09.2016.
 */
    public class BaseStore<T extends Base> implements Store<T> {

        private SimpleArray<T> array;

        public BaseStore(int size){
            this.array = new SimpleArray<>(size);
        }

    @Override
    public boolean add(T value) {
        if(value == null){
        return false;
        }
        T param = this.get(value.getId());
        if (param != null){
            return false;
        }
        this.array.add(value);
        return true;
    }

    @Override
    public boolean delete(String id) {
        if(id == null){
            return false;
        }
        T param = this.get(id);
        if (param == null){
            return false;
        }
        this.array.delete(param);
        return true;
    }

    public boolean update(T val) {
        if(val == null){
            return false;
        }
        T param = this.get(val.getId());
        if (param == null){
            return false;
        }
        this.array.update(param, val);
        return true;
    }

    @Override
    public T get(String id) {
        T res = null;
        int value = 0;
        if (id == null) {
            return res;
        }
        
        for (int i = 0; i < value; i++) {
            T param = this.array.get(i);
            if (id.equals(param.getId())){
                res = param;
                break;
            }
        }
        return res;
    }
}
