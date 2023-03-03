import javax.swing.*;

public class calculator {

    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JButton xButton;
    private JButton button4;
    private JButton button3;
    private JTextField textField1;

    public void setData(Main data) {
        textField2.setText(data.getTextField2());
        textField1.setText(data.getTextField1());
    }

    public void getData(Main data) {
        data.setTextField2(textField2.getText());
        data.setTextField1(textField1.getText());
    }

    public boolean isModified(Main data) {
        if (textField2.getText() != null ? !textField2.getText().equals(data.getTextField2()) : data.getTextField2() != null)
            return true;
        if (textField1.getText() != null ? !textField1.getText().equals(data.getTextField1()) : data.getTextField1() != null)
            return true;
        return false;
    }
}
