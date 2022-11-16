import java.util.Random;

public class MagicBox<T> {
    protected T[] box;
    protected Random random = new Random();
    public MagicBox(int capacity){
        box = (T[]) new Object[capacity];
    }

    boolean add(T item){
        if(item == null){
            return false;
        }
        for(int i = 0; i < box.length; i++) {
            if(box[i] != null){
                continue;
            }
            box[i] = item;
            return true;
        }
        return false;
    }
    T pick(){
        int num = 0;
        int randomInt = random.nextInt(box.length);
        for (T item: box) {
            if (item == null){
                num++;
            }
        }
        if(num != 0){
            throw new RuntimeException("В коробке есть еще " + num + " свободных ячеек");
        }
        return box[randomInt];
    }
}
