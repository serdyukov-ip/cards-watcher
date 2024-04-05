# Cards Watcher

## Содержание
- [О проекте](#о-проекте)
- [Технологии и библиотеки](#технологии-и-библиотеки)
- [Тестирование](#тестирование)
- [Контакты](#контакты)

## О проекте

![gif_for_project](https://github.com/serdyukov-ip/cards-watcher/assets/53144887/ad67d2fc-778a-42b7-8b65-ae84e7a2ebd3)

CardWatcher - это веб-приложение, которое позволяет пользователям легко отслеживать сроки платежей по кредитным картам. Проект находится в активной разработке.

На данный момент реализован следующий функционал:
- Регистрация и аутентификация пользователей (шифрование Bcrypt)
- Добавление, редактирование и удаление кредитных карт
- Добавление, редактирование и удаление платежей по кредитным картам

В процессе разработки будет реализован функционал:
- Личный кабинет пользователя с возможностью изменения пароля, логина и никнейма
- Добавление калькуляторов для расчета льготного периода
- Выгрузка информации по платежам в PDF
- Назначение цвета для карты
- Назначение цвета для платежа

В процессе разработки будут внедрены технические особенности:
- Использование CSRF токенов для защиты от CSRF-атак
- Логгирование с помощью slf4j + внедрение ELK
- Покрытие тестами более 90% кода

## Языки, технологии и библиотеки
- Java 17
- Spring MVC
- Spring Boot
- Spring Data JPA
- Spring Security
- PostgreSQL
- Thymeleaf
- Lombok
- Bootstrap
- JavaScript
- HTML
- CSS

## Тестирование

Для тестирования проекта необходимы Docker, Docker-Compose и Maven. Чтобы начать тестирование, выполните следующие шаги:

1. Склонируйте репозиторий:
```bash
git clone https://github.com/serdyukov-ip/CardWatcher.git
```
2. Соберите проект:
```bash
 mvn clean package
```
3. В корне проекта запустите сборку docker-compose:
```dockerfile
docker-compose up --build
```
4. Дождитесь запуска контейнеров.
5. Откройте браузер и перейдите по адресу `http://localhost:8080/auth/login`

Далее можно создать новую учетную запись или аутентифицироваться под тестовыми пользователями с логинами user1, user2, user3 (для всех пароль pass1234).
После пункта 4 будут созданы и запущены два контейнера. Для контейнера Spring Boot будут открыты порты `8080:8080`, а для контейнера PostgreSQL - `5432:5432`. Контейнеры будут взаимодействовать между собой. 
Также для контейнера PosgtreSQL будут инициализированы тестовые таблицы и данные.

## Контакты

- Email: serdyukov-ip@yandex.ru
- Telegram: @IlyaJavaDev

## Примечания

Приложение не хранит CVC/CVV код, срок действия, полный номер карты.