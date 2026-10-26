<html>
<head>
<title>Tree.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #2aacb8;}
.s4 { color: #6aab73;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Tree.java</font>
</center></td></tr></table>
<pre><span class="s0">public class </span><span class="s1">Tree </span><span class="s2">{</span>
    <span class="s0">public </span><span class="s1">Node root</span><span class="s2">;</span>

    <span class="s0">public void </span><span class="s1">addNode</span><span class="s2">(</span><span class="s0">int </span><span class="s1">value</span><span class="s2">) {</span>
        <span class="s1">root </span><span class="s2">= </span><span class="s1">addNodeRecursive</span><span class="s2">(</span><span class="s1">value</span><span class="s2">, </span><span class="s1">root</span><span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s0">private </span><span class="s1">Node addNodeRecursive</span><span class="s2">(</span><span class="s0">int </span><span class="s1">value</span><span class="s2">, </span><span class="s1">Node currentNode</span><span class="s2">) {</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">currentNode </span><span class="s2">== </span><span class="s0">null</span><span class="s2">) {</span>
            <span class="s0">return new </span><span class="s1">Node</span><span class="s2">(</span><span class="s1">value</span><span class="s2">);</span>
        <span class="s2">}</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">value </span><span class="s2">&lt; </span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">value</span><span class="s2">) {</span>
            <span class="s1">currentNode</span><span class="s2">.</span><span class="s1">left </span><span class="s2">= </span><span class="s1">addNodeRecursive</span><span class="s2">(</span><span class="s1">value</span><span class="s2">, </span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">left</span><span class="s2">);</span>
        <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">value </span><span class="s2">&gt; </span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">value</span><span class="s2">) {</span>
            <span class="s1">currentNode</span><span class="s2">.</span><span class="s1">right </span><span class="s2">= </span><span class="s1">addNodeRecursive</span><span class="s2">(</span><span class="s1">value</span><span class="s2">, </span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">right</span><span class="s2">);</span>
        <span class="s2">}</span>
        <span class="s0">return </span><span class="s1">currentNode</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s0">public int </span><span class="s1">countLeaves</span><span class="s2">() {</span>
        <span class="s0">return </span><span class="s1">countLeavesRecursive</span><span class="s2">(</span><span class="s1">root</span><span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s0">private int </span><span class="s1">countLeavesRecursive</span><span class="s2">(</span><span class="s1">Node currentNode</span><span class="s2">) {</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">currentNode </span><span class="s2">== </span><span class="s0">null</span><span class="s2">) {</span>
            <span class="s0">return </span><span class="s3">0</span><span class="s2">;</span>
        <span class="s2">}</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">left </span><span class="s2">== </span><span class="s0">null </span><span class="s2">&amp;&amp; </span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">right </span><span class="s2">== </span><span class="s0">null</span><span class="s2">) {</span>
            <span class="s0">return </span><span class="s3">1</span><span class="s2">;</span>
        <span class="s2">}</span>
        <span class="s0">return </span><span class="s1">countLeavesRecursive</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">left</span><span class="s2">) + </span><span class="s1">countLeavesRecursive</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">right</span><span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s0">public void </span><span class="s1">preOrder</span><span class="s2">() {</span>
        <span class="s1">preOrderTraversal</span><span class="s2">(</span><span class="s1">root</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">();</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">preOrderTraversal</span><span class="s2">(</span><span class="s1">Node currentNode</span><span class="s2">) {</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">currentNode </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">value </span><span class="s2">+ </span><span class="s4">&quot; &quot;</span><span class="s2">);</span>
            <span class="s1">preOrderTraversal</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">left</span><span class="s2">);</span>
            <span class="s1">preOrderTraversal</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">right</span><span class="s2">);</span>
        <span class="s2">}</span>
    <span class="s2">}</span>

    <span class="s0">public void </span><span class="s1">inOrder</span><span class="s2">() {</span>
        <span class="s1">inOrderTraversal</span><span class="s2">(</span><span class="s1">root</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">();</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">inOrderTraversal</span><span class="s2">(</span><span class="s1">Node currentNode</span><span class="s2">) {</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">currentNode </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
            <span class="s1">inOrderTraversal</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">left</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">value </span><span class="s2">+ </span><span class="s4">&quot; &quot;</span><span class="s2">);</span>
            <span class="s1">inOrderTraversal</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">right</span><span class="s2">);</span>
        <span class="s2">}</span>
    <span class="s2">}</span>

    <span class="s0">public void </span><span class="s1">postOrder</span><span class="s2">() {</span>
        <span class="s1">postOrderTraversal</span><span class="s2">(</span><span class="s1">root</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">();</span>
    <span class="s2">}</span>

    <span class="s0">private void </span><span class="s1">postOrderTraversal</span><span class="s2">(</span><span class="s1">Node currentNode</span><span class="s2">) {</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">currentNode </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
            <span class="s1">postOrderTraversal</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">left</span><span class="s2">);   </span>
            <span class="s1">postOrderTraversal</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">right</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s1">currentNode</span><span class="s2">.</span><span class="s1">value </span><span class="s2">+ </span><span class="s4">&quot; &quot;</span><span class="s2">);</span>
        <span class="s2">}</span>
    <span class="s2">}</span>
<span class="s2">}</span></pre>
</body>
</html>