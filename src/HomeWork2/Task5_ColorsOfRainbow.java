//5. По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.).


public class Task5_ColorsOfRainbow {
    public static void main(String[] args) {
            int colorNumber = 6;
            String color;

            switch (colorNumber) {
                case 1:
                    color = "красный";
                    break;
                case 2:
                    color = "оранжевый";
                    break;
                case 3:
                    color = "желтый";
                    break;
                case 4:
                    color = "зеленый";
                    break;
                case 5:
                    color = "голубой";
                    break;
                case 6:
                    color = "синий";
                    break;
                case 7:
                    color = "фиолетовый";
                    break;
                default:
                    color = "неизвестный";
                    break;
            }

            System.out.println("Цвет радуги: " + color);
        }
  }
