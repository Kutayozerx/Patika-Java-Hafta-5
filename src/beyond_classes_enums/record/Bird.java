package beyond_classes_enums.record;

public record Bird(int numberEggs, String name) {

public Bird(int numberEggs, String name , String nickName){
    this(numberEggs,name + "-" + nickName);
  }
}
