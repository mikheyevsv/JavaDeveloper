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

    @Override
    public boolean update(T val) {
        return false;
    }

    @Override
    public T get(String id) {
        return null;
    }
}
