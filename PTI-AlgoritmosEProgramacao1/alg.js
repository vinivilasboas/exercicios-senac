//Algoritmo para definição de uso de álcool ou gasolina
do{
    var gas = prompt("Digite o preço da gasolina: ")
    var gas1 = parseFloat(gas.replace(",", "."))
    var alc = prompt("Digite o preço do álcool: ")
    var alc1 = parseFloat(alc.replace(",", "."))
    var coeficiente = alc1 / gas1 //coeficiente de eficiência

    if (parseFloat(coeficiente)>0.7){
        console.log("Abastecer com gasolina é mais vantajoso")
    } else if (parseFloat(coeficiente)<0.7){
        console.log("Abastecer com álcool é mais vantajoso")
    } else{
        console.log("É indiferente")
    }
    
    var resp = prompt("Deseja efetuar um novo cálculo [S/N]? ")
    var resp1 = resp.toUpperCase()
}while(resp1=="S")