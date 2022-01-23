package randomFio;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String name[] = {"Иветта", "Лизетта", "Мюзетта", "Жанетта", "Жоржетта", "Колетта", "Полетта", "Клоретта", "Флоретта", "Мариетта"};
        String surname[] = {"Бондюель", "Брюссель", "Кусто", "Жабо", "Гюго", "Де Фюнес", "Фантомас", "Карабас", "Людвиг", "Маре"};
        String patronymic[] = {"Ивановна", "Борисовна", "Константиновна", "Евгеньевна", "Георгиевна", "Дмитриевна", "Федоровна", "Максимовна", "Леопольдовна", "Михайловна"};
        Random random = new Random();
        StringBuilder fio = new StringBuilder();
        for (int i = 0; i < 10; i++) {
//        fio.append(name[random.nextInt(name.length)])
//                .append(" ")
//                .append(patronymic[random.nextInt(patronymic.length)])
//                .append(" ")
//                .append(surname[random.nextInt(surname.length)])
//                .append("\n");



            fio.append(name[random.nextInt(name.length)]);
            fio.append(" ");
            fio.append(patronymic[random.nextInt(patronymic.length)]);
            fio.append(" ");
            fio.append(surname[random.nextInt(surname.length)]);
            fio.append("\n");
        }
        System.out.println(fio);
    }
}
