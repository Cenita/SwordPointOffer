## 剑指Offer 算法题整理汇总

**简介**

剑指Offer中所有的面试题，建议一边看书一边来[LeetCode](https://leetcode-cn.com/problemset/lcof/)上做

本算法题汇总只提炼重要的解析，如果希望明白其中的算法思路建议看LeetCode或书上的解析

适合复习剑指Offer的同学，简要指出其知识点

如果你需要Java代码，可访问源码地址Clone下
[源码](https://github.com/Cenita/SwordPointOffer/tree/master/code)。


建议复习的时候先看题目然后思考解决方法

如果忘记则打开链接中的答案来看答案。
  
  ---
[03数组中重复的数字](https://github.com/Cenita/SwordPointOffer/blob/master/note/03%E6%95%B0%E7%BB%84%E4%B8%AD%E9%87%8D%E5%A4%8D%E7%9A%84%E6%95%B0%E5%AD%97.md)

**题目描述**
>在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

**示例**
>输入：[2, 3, 1, 0, 2, 5, 3]
>输出：2或3
 
 ---
[04二维数组中的查找](https://github.com/Cenita/SwordPointOffer/blob/master/note/04%E4%BA%8C%E7%BB%B4%E6%95%B0%E7%BB%84%E4%B8%AD%E7%9A%84%E6%9F%A5%E6%89%BE.md)
 
 **题目描述**
>在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
**限制：**
`0 <= n <= 1000`
`0 <= m <= 1000`

**示例**
```python
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
```
>给定 target = 5，返回 true。
给定 target = 20，返回 false。
 
 ----
[05替换空格](https://github.com/Cenita/SwordPointOffer/blob/master/note/05%E6%9B%BF%E6%8D%A2%E7%A9%BA%E6%A0%BC.md)

**题目描述**
>请实现一个函数，把字符串 `s` 中的每个空格替换成"%20"。

**示例**
>输入：s = "We are happy."
输出："We%20are%20happy."
  
 ----
[06从尾到头打印链表](https://github.com/Cenita/SwordPointOffer/blob/master/note/06%E4%BB%8E%E5%B0%BE%E5%88%B0%E5%A4%B4%E6%89%93%E5%8D%B0%E9%93%BE%E8%A1%A8.md)

**题目描述**
>输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

**示例**
>输入：head = [1,3,2]
输出：[2,3,1]
 
 ---- 
[07重建二叉树](https://github.com/Cenita/SwordPointOffer/blob/master/note/07%E9%87%8D%E5%BB%BA%E4%BA%8C%E5%8F%89%E6%A0%91.md)
  
**题目描述**
> 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

**示例**
>前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]

返回
```
    3
   / \
  9  20
	/  \
   15   7
```

----
[09双栈变队列](https://github.com/Cenita/SwordPointOffer/blob/master/note/09%E5%8F%8C%E6%A0%88%E5%8F%98%E9%98%9F%E5%88%97.md)

**题目描述**
>用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

**示例**
>输入：
["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
[[],[],[5],[2],[],[]]
输出：[null,-1,null,null,5,2]
 
 ----
[10斐波那契数列](https://github.com/Cenita/SwordPointOffer/blob/master/note/10%E6%96%90%E6%B3%A2%E9%82%A3%E5%A5%91%E6%95%B0%E5%88%97.md)
  
**题目描述**
>写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

**示例**
>输入：n = 5
输出：5

---
[11旋转数组的最小数字](https://github.com/Cenita/SwordPointOffer/blob/master/note/11%E6%97%8B%E8%BD%AC%E6%95%B0%E7%BB%84%E7%9A%84%E6%9C%80%E5%B0%8F%E6%95%B0%E5%AD%97.md)

**题目描述**
>把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。 要求时间复杂度使用O(logN) 

**示例**
>输入：[3,4,5,1,2]
输出：1

>输入：[2,2,2,0,1]
输出：0

---
[12矩阵中的路径](https://github.com/Cenita/SwordPointOffer/blob/master/note/12%E7%9F%A9%E9%98%B5%E4%B8%AD%E7%9A%84%E8%B7%AF%E5%BE%84.md)

**题目描述**
>请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
[["a","b","c","e"],
["s","f","c","s"],
["a","d","e","e"]]
但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。

**示例**
>输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
输出：true

>输入：board = [["a","b"],["c","d"]], word = "abcd"
输出：false

---
[13机器人的运动范围](https://github.com/Cenita/SwordPointOffer/blob/master/note/13%E6%9C%BA%E5%99%A8%E4%BA%BA%E7%9A%84%E8%BF%90%E5%8A%A8%E8%8C%83%E5%9B%B4.md)

**题目描述**
>地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？

**示例**
>输入：m = 2, n = 3, k = 1
输出：3

>输入：m = 3, n = 1, k = 0
输出：1

>输入：m = 38, n = 15, k = 9
输出：135


---
[14剪绳子](https://github.com/Cenita/SwordPointOffer/blob/master/note/14剪绳子.md)

**题目描述**
>给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。

**示例**
>输入:  10
输出: 36
解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36

>输入:  2
输出: 1
解释: 2 = 1 + 1, 1 × 1 = 1

---
[15Excle序号转化进制附加题](https://github.com/Cenita/SwordPointOffer/blob/master/note/15Excle序号转化进制附加题.md)

**题目描述**
>给定一个Excel表格中的列名称，返回其相应的列序号。
例如，
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...

**示例**
>**输入:** "A"
**输出:** 1

>**输入:** "AB"
**输出:** 28

>**输入:** "ZY"
**输出:** 701

---
[15二进制中1的个数](https://github.com/Cenita/SwordPointOffer/blob/master/note/15二进制中1的个数.md)

**题目描述**
>请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。

**示例**
>输入：00000000000000000000000000001011
输出：3
解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。

---
[16数值的整数次方](https://github.com/Cenita/SwordPointOffer/blob/master/note/16数值的整数次方.md)
  

**题目描述**
>实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。

**示例**
>**输入:** 2.00000, -2
**输出:** 0.25000
**解释:** 2-2 = 1/22 = 1/4 = 0.25

>**输入:** 2.10000, 3
**输出:** 9.26100

---
[17打印从1到最大的n个位数](https://github.com/Cenita/SwordPointOffer/blob/master/note/17打印从1到最大的n个位数.md)

**题目描述**
>输入数字 `n`，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。

---
**示例**
>输入: n = 1
输出: [1,2,3,4,5,6,7,8,9]

---
[18删除链表的节点](https://github.com/Cenita/SwordPointOffer/blob/master/note/18删除链表的节点.md)

**题目描述**
>给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
返回删除后的链表的头节点。

**示例**
>输入: head = [4,5,1,9], val = 5
输出: [4,1,9]
解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.

>输入: head = [4,5,1,9], val = 1
输出: [4,5,9]
解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.

---
[19正则表达式匹配](https://github.com/Cenita/SwordPointOffer/blob/master/note/19正则表达式匹配.md)
 
**题目描述**
>请实现一个函数用来匹配包含'. '和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（含0次）。在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。

**示例**
>**输入:**
s = "ab"
p = ".*"
**输出:** true
**解释:** ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。

---

[20表示数值的字符串](https://github.com/Cenita/SwordPointOffer/blob/master/note/20表示数值的字符串.md)


**题目描述**
>请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"0123"都表示数值，但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是。

**输入输出**
>+100
>true

---
[21调整数组顺序使奇数位于偶数前面](https://github.com/Cenita/SwordPointOffer/blob/master/note/21调整数组顺序使奇数位于偶数前面.md)

**题目描述**
>输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。

---
**示例**
>输入：nums = [1,2,3,4]
输出：[1,3,2,4] 
注：[3,1,2,4] 也是正确的答案之一。

---
[22链表中倒数第k个结点](https://github.com/Cenita/SwordPointOffer/blob/master/note/22链表中倒数第k个结点.md)

**题目描述**
>输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。

**示例**
>给定一个链表: 1->2->3->4->5, 和 _k_ = 2.
>返回链表 4->5.
>
---



[23链表中环的入口](https://github.com/Cenita/SwordPointOffer/blob/master/note/23链表中环的入口.md)
 











[24翻转链表](https://github.com/Cenita/SwordPointOffer/blob/master/note/24翻转链表.md)
  
[25合并两个排序的链表](https://github.com/Cenita/SwordPointOffer/blob/master/note/25合并两个排序的链表.md)
  
[28对称的二叉树](https://github.com/Cenita/SwordPointOffer/blob/master/note/28对称的二叉树.md)
  
[29顺时针打印矩阵](https://github.com/Cenita/SwordPointOffer/blob/master/note/29顺时针打印矩阵.md)
  
[30包含Min函数的栈](https://github.com/Cenita/SwordPointOffer/blob/master/note/30包含Min函数的栈.md)
  
[31栈的压入弹出序列](https://github.com/Cenita/SwordPointOffer/blob/master/note/31栈的压入弹出序列.md)
  
[32从上到下打印二叉树](https://github.com/Cenita/SwordPointOffer/blob/master/note/32从上到下打印二叉树.md)
  
[32-2分行从上到下打印二叉树](https://github.com/Cenita/SwordPointOffer/blob/master/note/32-2分行从上到下打印二叉树.md)
  
[32-3之形从上到下打印二叉树](https://github.com/Cenita/SwordPointOffer/blob/master/note/32-3之形从上到下打印二叉树.md)
  
[33二叉搜索树的后序遍历](https://github.com/Cenita/SwordPointOffer/blob/master/note/33二叉搜索树的后序遍历.md)
  
[34二叉树中和为某一值的路径](https://github.com/Cenita/SwordPointOffer/blob/master/note/34二叉树中和为某一值的路径.md)
  
[35复杂链表的复制](https://github.com/Cenita/SwordPointOffer/blob/master/note/35复杂链表的复制.md)
  
[36二叉搜索树与双向链表](https://github.com/Cenita/SwordPointOffer/blob/master/note/36二叉搜索树与双向链表.md)
  
[37序列化二叉树](https://github.com/Cenita/SwordPointOffer/blob/master/note/37序列化二叉树.md)
  
[38字符串的排雷](https://github.com/Cenita/SwordPointOffer/blob/master/note/38字符串的排雷.md)
  
[39数组中出现次数超过一半的数字](https://github.com/Cenita/SwordPointOffer/blob/master/note/39数组中出现次数超过一半的数字.md)
  
[40最小的k个数](https://github.com/Cenita/SwordPointOffer/blob/master/note/40最小的k个数.md)

[41数据流中中位数](https://github.com/Cenita/SwordPointOffer/blob/master/note/41数据流中中位数.md)

[42连续子数组最大和](https://github.com/Cenita/SwordPointOffer/blob/master/note/42连续子数组最大和.md)

[43-1~n整数中1的个数](https://github.com/Cenita/SwordPointOffer/blob/master/note/43-1~n整数中1的个数.md)

[44数列中某一位数组](https://github.com/Cenita/SwordPointOffer/blob/master/note/44数列中某一位数组.md)

[45把数组排成最小的数](https://github.com/Cenita/SwordPointOffer/blob/master/note/45把数组排成最小的数.md)

[46把数字翻译成字符串](https://github.com/Cenita/SwordPointOffer/blob/master/note/46把数字翻译成字符串.md)

[47礼物的最大价值](https://github.com/Cenita/SwordPointOffer/blob/master/note/47礼物的最大价值.md)

[48最长不含重复字符的子字符串](https://github.com/Cenita/SwordPointOffer/blob/master/note/48最长不含重复字符的子字符串.md)

[49丑数](https://github.com/Cenita/SwordPointOffer/blob/master/note/49丑数.md)

[50第一个只出现一次的字符](https://github.com/Cenita/SwordPointOffer/blob/master/note/50第一个只出现一次的字符.md)

[51数组中逆序对](https://github.com/Cenita/SwordPointOffer/blob/master/note/51数组中逆序对.md)

[52两个链表的第一个公共结点](https://github.com/Cenita/SwordPointOffer/blob/master/note/52两个链表的第一个公共结点.md)

[53数组中数值和下标相等的元素](https://github.com/Cenita/SwordPointOffer/blob/master/note/53数组中数值和下标相等的元素.md)

[53 0～n-1中缺失的数字- II](https://github.com/Cenita/SwordPointOffer/blob/master/note/53%200%EF%BD%9En-1%E4%B8%AD%E7%BC%BA%E5%A4%B1%E7%9A%84%E6%95%B0%E5%AD%97-%20II.md)

[53数组中数值和下标相等的元素](https://github.com/Cenita/SwordPointOffer/blob/master/note/53数组中数值和下标相等的元素.md)

[53在排序数组中查找数字 I](https://github.com/Cenita/SwordPointOffer/blob/master/note/53在排序数组中查找数字%20I.md)

[54二叉搜索树的第k大节点](https://github.com/Cenita/SwordPointOffer/blob/master/note/54二叉搜索树的第k大节点.md)

[55二叉树的深度](https://github.com/Cenita/SwordPointOffer/blob/master/note/55二叉树的深度.md)

[55II平衡二叉树](https://github.com/Cenita/SwordPointOffer/blob/master/note/55II平衡二叉树.md)

[56I数组中数字出现的次数](https://github.com/Cenita/SwordPointOffer/blob/master/note/56I数组中数字出现的次数.md)
[56II数组中唯一只出现一次的数字](https://github.com/Cenita/SwordPointOffer/blob/master/note/56II数组中唯一只出现一次的数字.md)

[57和为s的数字](https://github.com/Cenita/SwordPointOffer/blob/master/note/57和为s的数字.md)

[57II和为s的连续正数序列](https://github.com/Cenita/SwordPointOffer/blob/master/note/57II和为s的连续正数序列.md)

[58翻转字符串](https://github.com/Cenita/SwordPointOffer/blob/master/note/58翻转字符串.md)

[58 - II. 左旋转字符串](https://github.com/Cenita/SwordPointOffer/blob/master/note/58%20-%20II.%20%E5%B7%A6%E6%97%8B%E8%BD%AC%E5%AD%97%E7%AC%A6%E4%B8%B2.md)

[59 - I. 滑动窗口的最大值](https://github.com/Cenita/SwordPointOffer/blob/master/note/59%20-%20I.%20%E6%BB%91%E5%8A%A8%E7%AA%97%E5%8F%A3%E7%9A%84%E6%9C%80%E5%A4%A7%E5%80%BC.md)

[59 - II. 队列的最大值](https://github.com/Cenita/SwordPointOffer/blob/master/note/59%20-%20II.%20%E9%98%9F%E5%88%97%E7%9A%84%E6%9C%80%E5%A4%A7%E5%80%BC.md)

[60n个骰子的点数](https://github.com/Cenita/SwordPointOffer/blob/master/note/60n个骰子的点数.md)

[61扑克牌中的顺子](https://github.com/Cenita/SwordPointOffer/blob/master/note/61扑克牌中的顺子.md)

[62圆圈中最后剩下的数字](https://github.com/Cenita/SwordPointOffer/blob/master/note/62圆圈中最后剩下的数字.md)

[63股票利润最大值](https://github.com/Cenita/SwordPointOffer/blob/master/note/63股票利润最大值.md)

[64求1+2+3+n](https://github.com/Cenita/SwordPointOffer/blob/master/note/64求1+2+3+n.md)

[65不用加法求和](https://github.com/Cenita/SwordPointOffer/blob/master/note/65不用加法求和.md)

[66构建乘积数组](https://github.com/Cenita/SwordPointOffer/blob/master/note/66构建乘积数组.md)

[67把字符串转换成整数](https://github.com/Cenita/SwordPointOffer/blob/master/note/67把字符串转换成整数.md)

[68II二叉树的最近公共祖先](https://github.com/Cenita/SwordPointOffer/blob/master/note/68II二叉树的最近公共祖先.md)

[68I二叉搜索树的最近公共祖先](https://github.com/Cenita/SwordPointOffer/blob/master/note/68I二叉搜索树的最近公共祖先.md)

