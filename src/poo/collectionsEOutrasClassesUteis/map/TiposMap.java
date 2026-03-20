package src.poo.collectionsEOutrasClassesUteis.map;

public class TiposMap {
    /*
========================================
TIPOS DE MAP
========================================

----------------------------------------
1. HashMap
----------------------------------------

- Mais usado no mercado
- Não mantém ordem
- Muito rápido

QUANDO USAR:
-> padrão para backend
-> buscas rápidas

----------------------------------------
2. LinkedHashMap
----------------------------------------

- Mantém ordem de inserção

QUANDO USAR:
-> quando a ordem importa

----------------------------------------
3. TreeMap
----------------------------------------

- Ordena automaticamente pelas chaves

QUANDO USAR:
-> quando precisa de ordenação

----------------------------------------
4. Hashtable (LEGADO)
----------------------------------------

- Sincronizado (thread-safe)
- Mais lento
- Quase não usado

QUANDO USAR:
-> evitar

----------------------------------------
RESUMO PRÁTICO:
----------------------------------------

HashMap -> padrão ✔
LinkedHashMap -> manter ordem
TreeMap -> ordenado
Hashtable -> legado ❌
*/

/*
========================================
BOAS PRÁTICAS
========================================

Sempre use a interface:

Map<String, String> map = new HashMap<>();

NÃO faça:

HashMap<String, String> map = new HashMap<>();

----------------------------------------
POR QUÊ?
----------------------------------------

Permite trocar implementação facilmente:

Map<String, String> map = new TreeMap<>();
*/
}
