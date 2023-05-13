package BUS;

import java.util.ArrayList;
import java.util.List;

interface IsBussAccess<DataType> {

    // Lay thong tin doi tuong
    DataType get(DataType data);

    // Lay tat ca doi tuong
    ArrayList<DataType> getAll();

    // Them doi tuong
    boolean add(DataType data);

    // Chinh sua doi tuong
    boolean edit(DataType data);

    // Xoa doi tuong
    boolean remove(DataType data);

    // Lay khoa chinh moi nhat
    DataType getNewest();
}
