# Algorithms_and_data_structures_Seminar

## Семинар 1
1. Необходимо написать алгоритм, считающий сумму всех чисел
от 1 до N. Согласно свойствам линейной сложности,
количество итераций цикла будет линейно изменяться
относительно изменения размера N.

2. Написать алгоритм поиска простых чисел (делятся только на себя и на 1)
в диапазоне от 1 до N. В алгоритме будет использоваться вложенный for,
что явно говорит о квадратичной сложности. Напишем самым быстрым способом.

3. Необходимо написать алгоритм поиска всех доступных комбинаций для
количества кубиков K с количеством граней N.
* Вариант 1: количество кубиков может быть строго ограничено (4
кубика, например)  
* Вариант 2: либо их количество будет динамическим (N задает
пользователь)  
* Определить сложность полученного варианта решения

4. Числа Фибоначчи
Пишем алгоритм поиска нужного числа последовательности
Фибоначчи.  
Считаем, что 1 и 2 значения последовательности равны 1. Искать будем
по формуле F(n) = F(n-1) + F(n-2), что предполагает использование
рекурсивного
алгоритма.  
* F(n) = F(n-1) + F(n-2)
* Используем рекурсию для решения
* Рекурсия заканчивается на значениях 1 и 2

## Семинар 2.

1. шейкерная сартировка. Модификация пузырька, в обе стороны.
* Необходимо написать один из простых алгоритмов сортировки,
имеющий сложность O(n2
).
* Можно выбрать из пузырьковой сортировки, сортировки вставками и
сортировки выбором.
* Следует обратить внимание на сложность данных алгоритмов и
указать признаки квадратичной сложности для каждого из них.

2. Написать алгоритм быстрого поиска (quicksort). Модернезированый. Сортировка слянием.
3. Пишем тесты для сравнения производительности сортировки больших
массивов.  
Для наглядного результата стоит сравнивать массивы до 100 000 элементов.
При таком подходе будет явно видно, какая из сортировок окажется быстрее.
4. После успешной сортировки массива на нем можно использовать бинарный
поиск. Необходимо реализовать алгоритм бинарного поиска по
элементам.  
Стоит акцентировать внимание, что т.к. алгоритм использует подход
«разделяй и властвуй», его удобно писать с помощью рекурсии.  
Так что стоит акцентировать внимание на алгоритмическую сложность
данного алгоритма, что его выполнение многократно быстрее простого
перебора на больших массивах

