package proMATEDIS.TAREAAUTONOMA;

public class Autonoma {
    public static boolean detectBaabaEnding(String word) {
        int state = 0;

        for (char c : word.toCharArray()) {
            switch (state) {
                case 0:
                    state = (c == 'b') ? 1 : 0;
                    break;
                case 1:
                    state = (c == 'a') ? 2 : (c == 'b' ? 1 : 0);
                    break;
                case 2:
                    state = (c == 'a') ? 3 : (c == 'b' ? 1 : 0);
                    break;
                case 3:
                    state = (c == 'b') ? 4 : (c == 'a' ? 3 : 0);
                    break;
                case 4:
                    state = (c == 'a') ? 5 : (c == 'b' ? 1 : 0);
                    break;
                case 5:
                    state = (c == 'b') ? 4 : (c == 'a' ? 3 : 0);
                    break;
            }
        }
        return state == 5;
    }

    public static void main(String[] args) {
        String[] testWords = {"baaba"};

        for (String word : testWords) {
            if (detectBaabaEnding(word)) {
                System.out.println(word + " ends with 'baaba'");
            } else {
                System.out.println(word + " does not end with 'baaba'");
            }
        }
    }
}