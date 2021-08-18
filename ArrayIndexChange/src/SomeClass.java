public class SomeClass {

    String[] words = new String[10];

    SomeClass() {
        for (int i = 0; i < words.length; i++) {
            words[i] = "John";
        }
    }

    public void Print()
    {
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }



    public void ChangeWord(int index, String value)
    {
        words[index] = value;
    }

}
