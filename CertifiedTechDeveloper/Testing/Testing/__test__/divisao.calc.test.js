const { divisao } = require('../calc.js');

describe('Testes de divisao', () =>{

    test('divisao de dois numeros', () =>{
        expect(divisao(2,2)).toBe(1);
    })

    test('divisao de dois zeros', () =>{
        expect(divisao(0,0)).toBe(NaN);
    })

    test('divisao de dois nulos', () =>{
        expect(divisao(null,null)).toBe(NaN);
    })

    test('divisao de strings', () =>{
        expect(divisao("a","b")).toBe(NaN);
    })

})