public class prism {
    private int length;
    private int width;
    private int height;

    public prism(int side){
        length = side;
        width = side;
        height = side;
    }

    public prism(){
        length = 26;
        width = 79;
        height = 51;
    }


    public prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public void setLength(int newLength) {
        length = newLength;
    }


    public void setWidth(int newWidth) {
        width = newWidth;
    }


    public void setHeight(int newHeight) {
        height = newHeight;
    }


    public int volume() {
        return length * width * height;
    }


    public int surfaceArea() {
        int bottomTom = length * width;
        int leftRight = length * height;
        int frontBack = width * height;
        int sa = 2 * bottomTom + 2 * leftRight + 2 * frontBack;
        return sa;
    }


    public String dimensions() {
        String str = "Length = " + length + "\n";
        str += "Width = " + width + "\n";
        str += "Height = " + height;
        return str;
    }
}

