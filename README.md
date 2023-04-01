# EstruturaDeDados1

De começo, setamos o String array com o nome de "v", o mesmo possui o tamanho de 25 indexes, junto a String name que vai ser usado para salvar os alunos dentro da Array e o Int i, que usaremos para fazer o for loop.
	
Portanto, ao fazermos o loop deixamos que seja inserido um valor a partir de 0 até 25, e os "+5" para representar mais cadastros, quando damos o input, ele vai ficando salvo na array "v" e quando chega na vigésima quinta vez que passa pelo loop, tem um if, qual lança uma mensagem que lista todos nomes cadastrados e diz que estamos no 25 cadastro, uma forma de acompanharmos o funcionamento.

Caso tentarmos colocar o próximo nome, receberemos um erro "java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 25", então podemos concluir que deixamos pré-definido um tamanho total em um array de no máximo 25 campos, portanto quando ele passa desse valor, não tem como salvar, retornando erro.
