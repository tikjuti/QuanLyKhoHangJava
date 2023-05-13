package GUI.component;

public class MyComboBox {

    Object value;
    Object text;

    public MyComboBox(Object value, Object text) {
        this.value = value;
        this.text = text;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getText() {
        return text;
    }

    public void setText(Object text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text.toString();
    }

    public int MaInt() {
        return Integer.parseInt(value.toString());
    }

    public String MaString() {
        return value.toString();
    }

}
