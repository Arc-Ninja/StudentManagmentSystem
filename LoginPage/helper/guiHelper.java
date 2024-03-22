package LoginPage.helper;

import javax.swing.JLabel;

public class guiHelper {

    public guiHelper(){

    }

    // For creating any object
    public void create(Object []obj, int n){
        for(int i=0;i<n;i++){
            obj[i] = new Object();
        }
    }

    // For creating JLabels
    public void createLabel(JLabel []obj, String []arr, int n){
        for(int i=0;i<n;i++){
            obj[i] = new JLabel(arr[i]);
        }
    }
}
