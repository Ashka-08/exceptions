package seminar_3;
/* Создайте класс Счетчик, у которого есть метод add(), увеличивающий
значение внутреннейint переменнойна 1.Сделайте так, чтобы с объектом
такого типа можно было работать в блоке try-with-resources. Нужно бросить
исключение, если работа с объектом типа счетчик была не в ресурсном try
и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
лучше всего. */
public class task_2 {
    public static void main(String[] args) {
        
    }

    public class Counter {
        private int i;

        private void add() {
            i+=1;
        }
    }
}
