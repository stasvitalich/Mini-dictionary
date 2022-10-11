// Напишем небольшой англо-русский словарь,
// который будет использовать when

fun main() {
    println("Введите слово на английском языке с большой буквы")
    var yourText: String? = readLine()
    var translate: String
    when (yourText) {
        "About" -> translate = "О/Про"
        "Alphabet" -> translate = "Алфавит"
        "Angry" -> translate = "Сердитый"
        "Because" -> translate = "Потому что"
        "Black" -> translate = "Чёрный"
        "Blue" -> translate = "Голубой"
        "Boy" -> translate = "Мальчик"
        "Brother" -> translate = "Брат"
        "Canada" -> translate = "Канада"
        "Car" -> translate = "Машина"
        "Cat" -> translate = "Кошка"
        "Child" -> translate = "Ребёнок"
        "Computer" -> translate = "Компьютер"
        "Country" -> translate = "Страна"
        "Dark" -> translate = "Тёмный"
        "Death" -> translate = "Смерть"
        "Dog" -> translate = "Собака"
        "Dream" -> translate = "Мечта/Сон"
        "English" -> translate = "Английский"
        "Family" -> translate = "Семья"
        "Father" -> translate = "Папа"
        "Film" -> translate = "Фильм"
        "Fish" -> translate = "Рыба"
        "Flower" -> translate = "Цветок"
        "Football" -> translate = "Футбол"
        "Game" -> translate = "Игра"
        "Ghost" -> translate = "Приведение"
        "Gold" -> translate = "Золото"
        "Girl" -> translate = "Девочка"
        "Home" -> translate = "Дом"
        "Horse" -> translate = "Лошадь"
        "If" -> translate = "Если"
        "Kiss" -> translate = "Поцелуй"
        "Lake" -> translate = "Озеро"
        "Love" -> translate = "Любовь"
        "Light" -> translate = "Свет"
        "Menu" -> translate = "Меню"
        "Moon" -> translate = "Луна"
        "Mother" -> translate = "Мама"
        "My" -> translate = "Мой"
        "News" -> translate = "Новости"
        "One" -> translate = "Один"
        "Our" -> translate = "Наш"
        "Pain" -> translate = "Боль"
        "Pig" -> translate = "Свинья"
        "Rain" -> translate = "Дождь"
        "Red"-> translate = "Красный"
        "Regret" -> translate = "Сожаление"
        "River" -> translate = "Река"
        "Russia" -> translate = "Россия"
        "Salary" -> translate = "Зарплата"
        "School" -> translate = "Школа"
        "Sister" -> translate = "Сестра"
        "Smile" -> translate = "Улыбка"
        "Sport" -> translate = "Спорт"
        "Sun" -> translate = "Солнце"
        "Teacher" -> translate = "Учитель"
        "Two" -> translate = "Два"
        "We" -> translate = "Мы"
        "Welder" -> translate = "Сварщик"
        "Wife" -> translate = "Жена"
        "Woman" -> translate = "Женщина"
        "Word" -> translate = "Слова"
        "You" -> translate = "Ты"
        "Yours" -> translate = "Твой"
        else -> {
            println("Мы пока ещё не знаем это слово, но обещаем исправиться!")
            return
                }
    }
    println("Перевод слова на русский: $translate")
}