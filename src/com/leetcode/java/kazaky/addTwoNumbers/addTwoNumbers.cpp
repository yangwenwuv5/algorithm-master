/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int temp = 0;
        ListNode *res = new ListNode(0),*head = res;
        while (l1 || l2) {
            int l1_val = l1 ? l1->val : 0;
            int l2_val = l2 ? l2->val : 0;
            head->next = new ListNode((l1_val + l2_val + temp) % 10);
            head = head->next;
            temp = (l1_val + l2_val + temp) / 10;
            if (l1)
                l1 = l1->next;
            if (l2)
                l2 = l2->next;
        }
        if (temp)
            head->next = new ListNode(1);
        return res->next;
    };
};