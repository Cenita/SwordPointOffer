## 30包含main函数的栈
**题目描述**
定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。

---
**解决方案**
申请一个辅助栈，例如主栈3,4,5,2,5,0则辅助栈为3,3,3,2,2,0 该pop的时候两个一起pop，只用push的时候判断一下就好了
```java
class MinStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public void push(int x) {
        mainStack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
        }else{
            int min = x<minStack.peek()?x:minStack.peek();
            minStack.push(min);
        }
    }
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    public int top() { return mainStack.peek(); }
    public int min() { return minStack.peek(); }
}
```

