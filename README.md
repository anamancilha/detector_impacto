# Detector de Impacto - Método da Bisseção

Este repositório contém uma implementação em **Java** para encontrar o ponto de impacto em uma trajetória modelada por uma equação polinomial de terceiro grau. O projeto utiliza o **Método da Bisseção**, um algoritmo de busca de raízes que refina iterativamente um intervalo para encontrar onde a função cruza o eixo zero.

## Sobre o Projeto

O algoritmo resolve a função:
$f(x) = 0,04x^3 - 0,8x^2 + 4,0x - 12,0$

O objetivo é identificar o valor de $x$ (ponto de impacto) dentro do intervalo $[10, 20]$ com uma precisão de $10^{-7}$.

## Tecnologias Utilizadas

*   **Linguagem:** Java 17+
*   **IDE:** Visual Studio Code

## Como Executar

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/seu-usuario/nome-do-repositorio.git)

2. **Compile o código:**
   ```bash
   javac DetectorImpacto.java
   
3.  **Execute o programa:**
    ```bash
    java DetectorImpacto
