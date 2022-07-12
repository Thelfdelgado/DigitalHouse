const { multiplicacao } = require('../calc.js');

describe('Testes de multiplicacao', () =>{

    test('multiplicacao de dois numeros', () =>{
        expect(multiplicacao(2,4)).toBe(8);
    })

    test('multiplicacao de dois zeros', () =>{
        expect(multiplicacao(0,0)).toBe(0);
    })

    test('multiplicacao de dois nulos', () =>{
        expect(multiplicacao(null,null)).toBe(0);
    })

    test('multiplicacao de strings', () =>{
        expect(multiplicacao("a","b")).toBe(NaN);
    })

})