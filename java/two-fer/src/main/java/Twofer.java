public class Twofer {
    public String twofer(String name) {
        String result = "";
        if(name!=null && !name.isEmpty()){
            result = "One for " + name + ", one for me.";
        } else{
            result = "One for you, one for me.";
        }
        return result;
    }
}
