package pmelnik.local.leetcode_medium;

import pmelnik.local.utils.ListNode;


/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order,
 * and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero,
 * except the number 0 itself.
 *
 *  Решение
 * Краткое описание решения
 * Складываем числа поразрядно, начиная с младших разрядов (головы списков).
 * Обрабатываем перенос и разные длины списков.
 * Анализ сложности
 * Время: O(max(m, n)), где m и n - длины списков
 * Память: O(max(m, n)) для результата
 */
public class AddTwoNumbersNum2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0); // Фиктивная голова для упрощения
        ListNode current = dummyHead;
        int carry = 0;

        // Проходим оба списка
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            // Добавляем значение из l1, если есть
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Добавляем значение из l2, если есть
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Вычисляем новую цифру и перенос
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }

}
