package hw1;

public class Owner  {
    
    private String name;

    // Конструктор класса Ownew
    public Owner(String name) {
        this.name = name;
    }
    // Геттер для получения имени владельца
        public String getName () {
            return name;
        }
     // Сеттер для установки имени владельца
        public void setName(String name) {
            this.name = name;
        }
  
    }
