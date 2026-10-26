**Nome do Aluno: Thiago Goldin Chianfa**

## Descrição
Este projeto consiste na implementação de uma Árvore de Busca Binária em Java para a disciplina de Algoritmos e Estrutura de Dados.

## Explicação
A estrutura foi dividida em três classes principais:
- **Node.java**: Representa a unidade fundamental da árvore, contendo um valor inteiro e referências para os nós filhos à esquerda e à direita.
- **Tree.java**: Implementa a lógica da Árvore de Busca Binária, contendo a raiz e métodos para:
  - **Inserção (addNode)**: Insere elementos recursivamente garantindo a propriedade da Árvore de Busca Binária, valores menores à esquerda e maiores à direita.
  - **Contagem de Folhas (countLeaves)**: Navega recursivamente pela árvore identificando e somando os nós que não possuem filhos.
  - **Percursos (preOrder, inOrder, postOrder)**: Métodos para travessia e exibição dos nós da árvore.
- **Main.java**: Instancia a árvore, realiza testes de inserção, exibe os percursos e demonstra a contagem de folhas.

## Exemplo de Utilização

Tree tree = new Tree();

tree.addNode(5);
tree.addNode(3);
tree.addNode(7);

tree.inOrder(); // Saída: 3 5 7

int totalFolhas = tree.countLeaves();
System.out.println("Quantidade de folhas: " + totalFolhas); // Saída: 2
