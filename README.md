# Лабораторная работа №1. Работа с базой данных

**Выполнила**: [Ваше имя]  
**Язык программирования**: Java

---

## Описание приложения

Приложение взаимодействует с базой данных SQLite и выполняет следующие функции:

1. **Создание базы данных**. При запуске приложения:
   - Создается таблица "Одногруппники" с полями: `ID`, `ФИО`, `Время добавления`.
   - Удаляются все записи.
   - Добавляются 5 записей с информацией об одногруппниках.

2. **Кнопки на главном экране**:
   - **Кнопка 1**: Переход на экран, где выводится список одногруппников.
   - **Кнопка 2**: Добавляет новую запись в таблицу.
   - **Кнопка 3**: Изменяет ФИО в последней записи на "Иванов Иван Иванович".

---

## Интерфейс

1. **Экран 1**: Три кнопки для управления базой данных.  
2. **Экран 2**: Список записей из таблицы в формате:  
   `ID: [номер], ФИО: [ФИО], Время добавления: [время]`.
