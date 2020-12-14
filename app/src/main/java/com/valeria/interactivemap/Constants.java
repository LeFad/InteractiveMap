package com.valeria.interactivemap;

public class Constants
{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "CountriesDB";
    public static final String TABLE = "Countries";
    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_CAPITAL = "capital";
    public static final String KEY_PRESIDENT = "president";
    public static final String KEY_CURRENCY = "currency";
    public static final String KEY_HISTORY = "history";
    public static final String KEY_IMAGE = "flag";
    public static final String CREATE_TABLE = "create table if not exists " + TABLE + "(" + KEY_ID
            + " integer primary key," + KEY_NAME + " text," + KEY_CAPITAL + " text," + KEY_PRESIDENT
            + " text," + KEY_CURRENCY + " text," + KEY_HISTORY + " text," + KEY_IMAGE + " text" + ")";

    public static final String INSERT_INTO="insert into "+TABLE+" ("+KEY_NAME+", "+KEY_CAPITAL+", "+KEY_PRESIDENT+", "+KEY_CURRENCY
            +", "+KEY_HISTORY+", "+KEY_IMAGE+") values ";

    public static final String INSERT_VALUES=
            "('Россия','Москва','Владимир Путин','Российский рубль, ₽ - RUB',"+R.string.history_Rus+","+R.drawable.rus_flag+"),"+
                    "('Финляндия','Хельсинки','Саули Ниинистё','Евро, EUR',"+R.string.history_Fin+","+R.drawable.fin_flag+"),"+
                    "('Швеция','Стокгольм','Король - Карл XVI Густав','Шведская крона, SEK',"+R.string.history_Swed+","+R.drawable.swed_flag+"),"+
                    "('Норвегия','Осло','Король - Харальд V','Норвежская крона, NOK',"+R.string.history_Norw+","+R.drawable.norw_flag+"),"+
                    "('Великобритания','Лондон','Королева - Елизавета II','Фунт стерлингов, GBP',"+R.string.history_UK+","+R.drawable.uk_flag+"),"+
                    "('Исландия','Рейкьявик','Гвюдни Йоуханнессон','Исландская крона, ISK',"+R.string.history_Ice+","+R.drawable.ice_flag+"),"+
                    "('Ирландия','Дублин','Майкл Хиггинс','Евро, EUR',"+R.string.history_Irel+","+R.drawable.irel_flag+"),"+
                    "('Португалия','Лиссабон','Марселу Ребелу ди Соза','Евро, EUR',"+R.string.history_Port+","+R.drawable.port_flag+"),"+
                    "('Испания','Мадрид','Король - Филипп VI','Евро, EUR',"+R.string.history_Spain+","+R.drawable.spain_flag+"),"+
                    "('Андорра','Андорра-ла-Велья','Сокнязья - Эмманюэль Макрон, Жоан Энрик Вивес-и-Сисилиа','Евро, EUR',"+R.string.history_Andorra+","+R.drawable.andora_flag+"),"+
                    "('Франция','Париж','Эмманюэль Макрон','Евро, EUR',"+R.string.history_France+","+R.drawable.france_flag+"),"+
                    "('Эстония','Таллин','Керсти Кальюлайд','Евро, EUR',"+R.string.history_Estonia+","+R.drawable.estonia_flag+"),"+
                    "('Латвия','Рига','Эгилс Левитс','Евро, EUR',"+R.string.history_Latvia+","+R.drawable.latvia_flag+"),"+
                    "('Литва','Вильнюс','Гитанас Науседа','Евро, EUR',"+R.string.history_Litvenia+","+R.drawable.litvenia_flag+"),"+
                    "('Дания','Копенгаген','Королева - Маргрете II','Датская крона, DKK',"+R.string.history_Denmark+","+R.drawable.denmark_flag+"),"+
                    "('Бельгия','Брюссель','Король - Филипп','Евро, EUR',"+R.string.history_Belg+","+R.drawable.belg_flag+"),"+
                    "('Нидерланды','Амстердам','Король - Виллем-Александр','Евро, EUR',"+R.string.history_Netherlands+","+R.drawable.netherlands_flag+"),"+
                    "('Люксембург','Люксембург','Великий герцог - Анри (Генрих)','Евро, EUR',"+R.string.history_Lux+","+R.drawable.lux_flag+"),"+
                    "('Белоруссия','Минск','Александр Лукашенко','Белорусский рубль, Br',"+R.string.history_Belarus+","+R.drawable.belarus_flag+"),"+
                    "('Германия','Берлин','Франк-Вальтер Штайнмайер','Евро, EUR',"+R.string.history_Germany+","+R.drawable.german_flag+"),"+
                    "('Польша','Варшава','Анджей Дуда','Польский злотый, PLN',"+R.string.history_Poland+","+R.drawable.poland_flag+"),"+
                    "('Украина','Киев','Владимир Зеленский','Гривна, ₴ — UAH',"+R.string.history_Ukraine+","+R.drawable.ukr_flag+"),"+
                    "('Чехия','Прага','Милош Земан','Чешская крона, CZK',"+R.string.history_Czech+","+R.drawable.czech_flag+"),"+
                    "('Швейцария','Берн (де-факто)','Симонетта Соммаруга','Швейцарский франк, CHF',"+R.string.history_Switz+","+R.drawable.switz_flag+"),"+
                    "('Лихтенштейн','Вадуц','Князь - Ханс-Адам II','Швейцарский франк, CHF',"+R.string.history_Liht+","+R.drawable.lihten_flag+"),"+
                    "('Австрия','Вена','Александр Ван дер Беллен','Евро, EUR',"+R.string.history_Austria+","+R.drawable.austria_flag+"),"+
                    "('Словакия','Братислава','Зузана Чапутова','Евро, EUR',"+R.string.history_Slovakia+","+R.drawable.slovakia_flag+"),"+
                    "('Молдавия','Кишинёв','Игорь Додон','Молдавский лей, MDL',"+R.string.history_Mold+","+R.drawable.mold_flag+"),"+
                    "('Венгрия','Будапешт','Янош Адер','Венгерский форинт, HUF',"+R.string.history_Hungary+","+R.drawable.hungary_flag+"),"+
                    "('Румыния','Бухарест','Клаус Йоханнис','Лей, RON',"+R.string.history_Romania+","+R.drawable.romania_flag+"),"+
                    "('Болгария','София','Румен Радев','Болгарский лев, BGN',"+R.string.history_Bulgaria+","+R.drawable.bulgaria_flag+"),"+
                    "('Словения','Любляна','Борут Пахор','Евро, EUR',"+R.string.history_Slovenia+","+R.drawable.slovenia_flag+"),"+
                    "('Хорватия','Загреб','Зоран Миланович','Хрватская куна, HRK',"+R.string.history_Croatia+","+R.drawable.croatia_flag+"),"+
                    "('Сербия','Белград','Александр Вучич','Сербский динар, RSD',"+R.string.history_Serbia+","+R.drawable.serbia_flag+"),"+
                    "('Босния и Герцеговина','Сараево','Валентин Инцко','Конвертируемая марка',"+R.string.history_Bosnia+","+R.drawable.bosnia_flag+"),"+
                    "('Черногория','Подгорица','Мило Джуканович','Евро, EUR',"+R.string.history_Montenegro+","+R.drawable.montenegro_flag+"),"+
                    "('Республика Косово','Приштина','Хашим Тачи','Евро, EUR',"+R.string.history_Kosovo+","+R.drawable.kosovo_flag+"),"+
                    "('Северная Македония','Скопье','Стево Пендаровский','Македонский денар',"+R.string.history_Macedonia+","+R.drawable.macedonia_flag+"),"+
                    "('Албания','Тирана','Илир Мета','Лек, ALB',"+R.string.history_Albania+","+R.drawable.albania_flag+"),"+
                    "('Греция','Афины','Катерина Сакелларопулу','Евро, EUR',"+R.string.history_Greece+","+R.drawable.greece_flag+"),"+
                    "('Италия','Рим','Серджо Маттарелла','Евро, EUR',"+R.string.history_Italy+","+R.drawable.italy_flag+"),"+
                    "('Монако','Монако','Князь - Альбер II','Евро, EUR',"+R.string.history_Monaco+","+R.drawable.monaco_flag+"),"+
                    "('Сан-Марино','Сан-Марино','Капитаны-регенты - Алессандро Карделли, Мирко Дольчини','Евро, EUR',"+R.string.history_San+","+R.drawable.san_flag+"),"+
                    "('Ватикан','Ватикан','Папа Римский - Франциск','Евро, EUR',"+R.string.history_Vatican+","+R.drawable.vatican_flag+"),"+
                    "('Мальта','Валлетта','Джордж Велла','Евро, EUR',"+R.string.history_Malta+","+R.drawable.malta_flag+")";



   public static int idIndex;
   public static int nameIndex;
   public static int capitalIndex;
   public static int presidentIndex;
   public static int currencyIndex;
   public static int historyIndex;
   public static int imgIndex;

}
