package beyond_classes_enums.record;

public record Rectangle(int with , int height) {

    public int area (){
        return with * height;
    }
}
