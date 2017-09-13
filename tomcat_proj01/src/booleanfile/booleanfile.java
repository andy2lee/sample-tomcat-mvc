package booleanfile;

public class booleanfile {
    public boolean is_correct_or_wrong(String name, String password){
        if (name.equals("andy") && password.equals("123456")){
            return true;
        }else {
            return false;
        }
    }
}
