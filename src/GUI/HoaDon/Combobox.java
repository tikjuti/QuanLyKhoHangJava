
package GUI.HoaDon;

public class Combobox {
Object text;
Object value;

    public Combobox() {
    }

    public Combobox(Object text, Object value) {
        this.text = text;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value= value;
    }
    
    @Override
    public String toString() {
        return text.toString();
    }
    // Lấy mã sang int
    
    public int getMaInt(){
        return Integer.parseInt(String.valueOf(value.toString()));
    }
    public String getMaString(){
        return value.toString();
    }
    
    
}
