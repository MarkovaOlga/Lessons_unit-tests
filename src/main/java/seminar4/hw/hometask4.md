## Задание 1. Ответьте письменно на вопросы: ##

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

Использование тестовых заглушек снижает сложность тестов и позволяет проверять код независимо от остальной системы. Тестовые заглушки упрощают тестирование, они передаются тестируемой системе вместо реальных зависимостей.

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

Следует использовать тип заглушки mock и метод verify для сравнения ожидаемого значения с тем, которое передаётся тестируемой системой. 

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

Следует использовать stub. Stub-обьекты предоставляют готовые ответы на наши вызовы, возвращают предопределённое значение.

4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?
 
Следует использовать тип заглушки fake. Ее задача предоставить простые и быстрые ответы клиенту. Это замена тяжеловесного внешнего зависимого объекта легковесной реализацией.
