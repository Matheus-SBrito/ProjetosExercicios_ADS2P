ADS – IFPB – Campus Santa Rita

LISTA SEMANAL – PROGRAMAÇÃO ORIENTADA A OBJETOS
Prof. Cleyton Caetano de Souza

Observação I: essa lista pode ser feita em dupla. 

Observação II: algumas questões dessa lista pedem para escrever um programa. Nessas questões, é apenas para escrever o main.

Observação III: Ao longo dessa lista, você precisará reescrever algumas classes e programa. Ao escrever a resposta para entregar, só precisa enviar a última versão de classe e programa. 

Semana 3

1. O operador ternário é uma alternativa mais resumida para substituir o “if-else”, em algumas situações específicas. Pesquise sobre o funcionamento do operador ternário e, considerando isso, preencha a tabela de acompanhamento com o valor das variáveis x, y, z e w, ao final de cada linha, durante a execução do programa abaixo: 

2. Escreva um programa onde você vai ler dois nomes fornecidos pelo usuário. Em seguida, indique se os nomes fornecidos são iguais ou não. Lembre-se, não se deve comparar objetos usando o operador de igualdade, por isso pesquise sobre como comparar os nomes utilizando a classe String.

3. Utilizando o switch-case, faça um programa que leia o nome de um mês por extenso e informe quantos dias tem esse mês. 

Projeto Calculadora de IMC

4. Crie uma classe chamada Paciente, com os atributos peso (float) e altura (float). Siga as convenções de nomenclatura e visibilidade vistas em sala de aula. Crie uma classe chamada Nutricionista, que será responsável por fazer a avaliação física do Paciente, através do cálculo do seu IMC. O IMC é o resultado da divisão do peso do paciente dividido pela altura elevada ao quadrado (). A classe Nutricionista possuirá um método chamado avaliarIMC, o qual receberá um objeto do tipo Paciente e retornará uma String correspondente à classificação do IMC do Paciente seguindo os seguintes critérios:

5. Escreva um programa em que você lerá os dados de um paciente e usará o nutricionista para exibir qual a classificação do paciente. 

6. Sobre o método avaliarIMC, você acha que o design proposto para esse método ficou bom? Justifique a sua resposta. 

7. Em Java, Enum é a criação de um tipo com valores pré-definidos. Pesquise sobre “Enum” e crie um Enum para representar as possíveis classificações do IMC (o nome do Enum pode ser ResultadoIMC e os valores do Enum são as categorias). Faça as alterações necessárias, no Nutricionista (o retorno do método avaliarIMC deve passar a ser um valor do tipo “ResultadoIMC”) e no programa, para poder fazer uso do Enum. 