class ResistorColor {

    String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

    int colorCode(String color) {
        for(int index = 0; index<colors.length; index++){
            if(colors[index].equals(color)){
                return index;
            }
        }
        return -1;
    }

    String[] colors() {
        return colors;
    }
}
