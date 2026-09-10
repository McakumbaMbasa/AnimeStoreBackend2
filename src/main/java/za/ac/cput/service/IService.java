package za.ac.cput.service;
//Vumbhoni Clifford Mnisi
//222929456
//Group 3G
public interface IService<T,ID>{
    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);

}
