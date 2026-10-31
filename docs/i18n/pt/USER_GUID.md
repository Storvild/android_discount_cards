🏠 **[Descrição principal (README)](README.md)** | ❓ **[Perguntas Frequentes (FAQ)](FAQ.md)**

# 📖 Guia do Usuário do DiscountCards

Bem-vindo ao **DiscountCards** – seu repositório de cartões de fidelidade seguro, rápido e totalmente autônomo. Este guia ajudará você a configurar o aplicativo, adicionar cartões e usá-los com a máxima eficiência.

---

## 📥 Capítulo 1: Instalação e primeira inicialização

1. **Download**: Acesse a seção de [Releases no GitHub](https://github.com/Storvild/android_discount_cards/releases) e baixe o arquivo mais recente com a extensão `.apk` (por exemplo, `discount_cards_v1.1 7.apk`).
2. **Instalação**: Abra o arquivo baixado. Se o sistema solicitar permissão, permita a instalação de aplicativos desta fonte (navegador ou gerenciador de arquivos) nas configurações do Android.
3. **Primeira inicialização**: O aplicativo abrirá instantaneamente. Ele não requer registro, criação de conta ou acesso à Internet.
4. **Permissões**: Na primeira tentativa de escanear um cartão com a câmera, o aplicativo solicitará acesso à **Câmera**. Esta permissão é opcional: você pode recusar se planeja adicionar cartões manualmente ou a partir da galeria.

---

## ➕ Capítulo 2: Adicionar um novo cartão

Toque no botão flutuante **«+»** na tela principal. Você também pode tocar no menu "Adicionar cartão...". Você pode usar três métodos para adicionar cartões (tocando nos ícones correspondentes ao lado do campo Código):

### Método A: Escaneamento com a câmera (Recomendado)
1. Aponte a câmera do celular para o cartão físico.
2. O aplicativo reconhecerá automaticamente o código de barras ou código QR usando o ML Kit.
3. Verifique o número reconhecido e toque em «Salvar».

### Método B: Seleção a partir de arquivo / galeria
1. Se você já tem uma foto do código de barras na galeria, escolha esta opção.
2. Selecione a imagem e o aplicativo extrairá os dados dela.

### Método C: Entrada manual
1. Insira o **Nome da loja** (por exemplo, «Carrefour»).
2. Insira o **Código do cartão** (manualmente ou copiando-o).
3. Selecione o **Tipo de código** da lista (por exemplo, `EAN_13` para a maioria dos cartões de supermercado, `QR_CODE` ou `PHONE` se o desconto for concedido apenas pelo número de telefone).
4. *(Opcional)* Adicione uma nota ou código CVC/CVV.
5. Toque em «Salvar».

---

## 🛒 Capítulo 3: Uso dos cartões no caixa

O aplicativo oferece várias maneiras convenientes de apresentar o cartão sem navegar por menus:

### 1. Método principal
- Abra o cartão desejado (utilize a busca, se necessário).
- Apresente o código de barras no caixa.

### 2. Modo de tela cheia (Em caso de problemas de leitura)
- Abra o cartão desejado.
- **Toque diretamente na imagem do código de barras**.
- Ele se expandirá para a tela cheia: o fundo ficará branco, o brilho da tela aumentará automaticamente para 100% e, na orientação retrato, o código de barras girará 90° para uma leitura ideal pelo leitor do caixa.

### 3. Widget na tela inicial
- Abra a tela onde você instalou o widget com o código de barras e mostre-o no caixa.
- Consulte o Capítulo 8 para saber como adicionar um widget.

### 4. Enviar código de barras (Compartilhar) se quiser que outra pessoa mostre o cartão no caixa.
- Na tela de detalhes do cartão, toque no botão **«Compartilhar imagem do código de barras»**.
- Selecione o aplicativo de mensagens ou aplicativo desejado. A imagem será enviada no formato PNG com margens brancas, garantindo o escaneamento com sucesso pelo destinatário.

---

## 🗂️ Capítulo 4: Gerenciamento e organização de cartões

Quando houver muitos cartões, as ferramentas de organização vêm em seu auxílio:

- **Busca**: Use a barra de busca no topo da tela principal. A busca funciona por nome da loja, número do cartão e notas.
- **Ordenação**: Toque no ícone de ordenação para organizar os cartões por nome, data de criação ou frequência de uso.
- **Favoritos**: Toque no ícone de estrela ⭐️ no cartão para mover cartões usados frequentemente para o início da lista.
- **Menu contextual**: Faça um **pressionamento longo** em qualquer cartão da lista para abrir rapidamente o menu «Editar» ou «Excluir».
- **Arquivo**: Se um cartão estiver desatualizado, mas você não quiser excluí-lo, abra seus detalhes e toque em «Mover para o arquivo». Cartões arquivados ficam ocultos da lista principal, da busca e da exportação, mas podem ser restaurados a qualquer momento pelo menu «Arquivo».

---

## 🎨 Capítulo 5: Personalização da aparência

Acesse as **Configurações** (ícone de engrenagem) para personalizar o aplicativo:

- **Tema de visualização**: Selecione o tema claro, escuro ou do sistema.
- **Modo de lista compacta**: Ative esta opção para ocultar os códigos de barras e números de cartão na tela principal. Isso reduz a altura dos cartões pela metade e acelera significativamente a rolagem em qualquer dispositivo.
- **Brilho no cartão**: Ative o controle deslizante de brilho diretamente na tela do cartão para ajuste manual rápido antes de escanear.
- **Idioma da interface**: Selecione um dos 11 idiomas suportados, independentemente do idioma do seu sistema.

*Ao editar um cartão individual, você também pode definir uma cor única (através de uma paleta ou código HEX, por exemplo `#0EE8A5`) e um ícone de categoria.*

---

## 💾 Capítulo 6: Backup e transferência de dados

Seus dados pertencem apenas a você. Crie cópias de segurança regularmente.

### Exportar (Criar cópia)
1. Acesse Configurações → **Exportar**.
2. Selecione o formato:
   - **JSON**: Formato completo com todos os detalhes (cores, ícones, datas, CVC, status de arquivo). Recomendado para transferência para outro dispositivo.
   - **CSV**: Formato de tabela (Nome, Código, Tipo de código, CVC, Nota). Conveniente para visualização no Excel.
3. Salve o arquivo em uma pasta conveniente ou envie-o imediatamente para si mesmo por aplicativo de mensagens ou nuvem.

### Importar (Restaurar cópia)
1. **Método automático**: Localize o arquivo `.json` ou `.csv` salvo no gerenciador de arquivos e toque nele. Selecione «Abrir com» → **DiscountCards**. O aplicativo iniciará automaticamente o processo de importação.
2. **Método manual**: Acesse Configurações → **Importar** e selecione o arquivo manualmente.
3. **Selecione o modo de importação**:
   - **Mesclar (MERGE)**: Adiciona novos cartões aos existentes (recomendado).
   - **Substituir (OVERWRITE)**: Exclui completamente os cartões atuais e os substitui pelos dados do arquivo.
4. **Se forem detectadas duplicatas**, o aplicativo proporá uma estratégia: atualizar existentes, adicionar como novos ou ignorar.

---

## ⚠️ Capítulo 7: Solução de problemas frequentes

| Problema | Solução |
| :--- | :--- |
| **O caixa não lê o código de barras da tela** | 1. Toque no código de barras para o modo de tela cheia (brilho máximo + fundo branco).<br>2. Certifique-se de ter selecionado o tipo de código correto ao criar o cartão (normalmente `EAN_13` ou `CODE_128`).<br>3. Limpe a tela de impressões digitais. |
| **A câmera não foca o cartão físico** | Forneça boa iluminação. Se a câmera não conseguir focar, tire uma foto do cartão com a câmera normal do celular e use a função «Selecionar a partir de arquivo» no DiscountCards. |
| **O aplicativo parece lento com uma grande quantidade de cartões** | Acesse Configurações e ative o **«Modo de lista compacta»**. Isso desativará a renderização de códigos de barras na lista geral e acelerará o desempenho significativamente. |
| **Não consigo encontrar o arquivo importado** | Certifique-se de ter baixado o arquivo no formato `.json` ou `.csv`. Ao importar, o aplicativo reconhece automaticamente os separadores no CSV (vírgula, ponto e vírgula ou tabulação). |

---

## Capítulo 8: 🧩 Widgets na tela inicial

**Como adicionar um widget à tela inicial do celular?**  
1. Mantenha pressionado qualquer espaço vazio na tela inicial do seu smartphone.  
2. No menu inferior que aparece, selecione a opção **«Widgets»**.  
3. Role a lista de aplicativos e encontre o **DiscountCards**.  
4. Mantenha pressionado o ícone do widget e, sem soltar o dedo, arraste-o para um espaço livre na tela.  
5. Imediatamente após o posicionamento, abrirá a janela de configuração: selecione o cartão de desconto desejado da sua lista e toque em «Concluído» (ou «Salvar»).
6. Nas configurações do widget há uma pré-visualização que mostra aproximadamente como o widget ficará em diferentes tamanhos (a exibição real depende do modelo do celular). O tamanho real do widget não muda por si só. Também nas configurações você pode especificar se deseja mostrar o Nome e o Código de barras.

**Como alterar o cartão selecionado ou as configurações do widget?**  
Você tem duas maneiras convenientes de fazer isso:  
- **Pelo próprio widget:** Toque no botão transparente de edição (no canto superior direito do próprio widget). Isso abrirá um menu onde você pode escolher outro cartão ou alterar os parâmetros de exibição.  
- **Pelo menu do Android:** Mantenha pressionado um widget já posicionado. No menu suspenso que aparece, toque em **«Configurações do widget»** (isso não funciona em todos os celulares).

**Como alterar o tamanho do widget?**  
O widget do DiscountCards é adaptável e suporta tamanhos de **1×1 a 5×5** células. Para alterar seu tamanho:  
1. Mantenha pressionado o widget na tela inicial.  
2. Quando ele for destacado, aparecerão marcadores de redimensionamento em suas bordas (normalmente pontos ou linhas azuis/de contraste).  
3. Puxe esses marcadores na direção desejada para aumentar ou diminuir a área do widget.  
4. Solte o dedo para fixar o novo tamanho.  
💡 *Dica:* No tamanho mínimo (1×1), apenas um ícone compacto ou mini código de barras será exibido. Para aumentar o código de barras, você pode desativar a exibição do Nome nas configurações. Para um escaneamento conveniente no caixa, recomenda-se usar o tamanho **2×2** ou superior, para que o nome da loja e um código de barras completo fiquem visíveis.

---

## 📬 Comentários e suporte

O aplicativo é desenvolvido pensando nos usuários. Se você encontrou um erro, tem uma sugestão de melhoria ou deseja adicionar suporte a um novo formato de código de barras, crie uma solicitação na seção de [Issues no GitHub](https://github.com/Storvild/android_discount_cards/issues).

*Obrigado por escolher o DiscountCards! Guarde seus descontos de forma segura e prática.*
