package Labs.Lab22;
public class DynamicArray<T> {  
  public static void main(String[] args) { 
    DynamicArray<String> list = new DynamicArray<>();

    list.add("X");
    list.add("Y");
    list.add("Z");

    System.out.println(list.remove()); // Returns Z
    System.out.println(list.remove()); // Returns Y
    System.out.println(list.remove()); // Returns X
    System.out.println(list.remove()); // Returns null

    }

    T[] array;
    int size;

    public DynamicArray() {
        this.array = (T[]) new Object[2];
        this.size = 0;
    }

    public T remove() {
        if (this.size <= 0) {
            return null;
        }
        T item = this.array[this.size - 1];
        this.array[this.size - 1] = null;
        this.size--;
        return item;
    }
    
    public void add(T item) {
        if (this.size == this.array.length) {
            T[] newArray = (T[]) new Object[this.array.length * 2];
            int i = 0;
            for (T elem : this.array) {
                newArray[i++] = elem;
            }
            this.array = newArray;
        }
        this.array[this.size] = item;
        this.size++;
    }
}
