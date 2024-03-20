# CardWatcher

## Содержание
- [О проекте](#о-проекте)
- [Технологии и библиотеки](#технологии-и-библиотеки)
- [Тестирование](#тестирование)
- [Контакты](#контакты)

## О проекте

![preview](https://github.com/serdyukov-ip/CardWatcher/assets/53144887/40f4ed7e-f140-451d-8388-293011ac44c9)

CardWatcher - это веб-приложение, которое позволяет пользователям легко отслеживать сроки платежей по кредитным картам. Проект находится в активной разработке.

На данный момент реализован следующий функционал:
- Регистрация и аутентификация пользователей
- Добавление, редактирование и удаление кредитных карт

Текущие работы над проектом включают:
- Управление платежами по кредитным картам
- Личный кабинет пользователя с возможностью изменения пароля, логина и никнейма

В процессе разработки реализуются следующие технические возможности:
- Шифрование паролей при регистрации и аутентификации
- Использование CSRF токенов для защиты от CSRF-атак
- Тестирование существующего и нового функционала

## Технологии и библиотеки

- Spring MVC
- Spring Boot
- Spring Data JPA
- Spring Security
- PostgreSQL
- Thymeleaf
- Bootstrap 5.0
- Lombok
- Mockito
- JavaScript
- HTML
- CSS

## Тестирование

Для тестирования проекта необходимы Docker, Docker-Compose и Maven. Чтобы начать тестирование, выполните следующие шаги:

1. Склонируйте репозиторий:
  - git clone https://github.com/serdyukov-ip/CardWatcher.git
2. Соберите проект:
  - mvn clean package
3. В корне проекта запустите сборку docker-compose:
  - docker-compose up --build
4. Дождитесь запуска контейнеров.
5. Откройте браузер и перейдите по адресу `http://localhost:8080/auth/login`

Далее можно создать новую учетную запись или аутентифицироваться под тестовыми пользователями с логинами user1, user2, user3 (для всех пароль pass1234).
После пункта 4 будут созданы и запущены два контейнера. Для контейнера Spring Boot будут открыты порты `8080:8080`, а для контейнера PostgreSQL - `5432:5432`. Контейнеры будут взаимодействовать. 
Также для контейнера PosgtreSQL будут созданы тестовые таблицы и данные. 

## Контакты

- Email: serdyukov-ip@yandex.ru
- Telegram: @IlyaJavaDev

## Примечания

Приложение не хранит CVC/CVV код, срок действия, полный номер карты.
