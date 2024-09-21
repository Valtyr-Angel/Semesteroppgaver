package tools;


public interface ObjectFileHandler<T>{
    void writeObjectsToFile(String fileName, T t);

    T readObjectsFromFile(String fileName);

}


