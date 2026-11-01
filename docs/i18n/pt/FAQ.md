🏠 **[Descrição principal (README)](README.md)** | 📖 **[Guia do Usuário](USER_GUID.md)**

# ❓ Perguntas Frequentes (FAQ) — DiscountCards

## 📌 Perguntas gerais

**O que é o DiscountCards?**  
É um aplicativo Android leve e rápido para armazenar, escanear e usar cartões de fidelidade e cartões de desconto. Ele substitui carteiras físicas cheias de cartões, permitindo mostrar instantaneamente o código de barras no caixa direto da tela do seu smartphone.

**O aplicativo é gratuito?**  
Sim, o projeto é totalmente gratuito e distribuído com código-fonte aberto (Open Source) sob a licença MIT. Você pode baixar a versão atual do APK na seção de [GitHub Releases](https://github.com/Storvild/android_discount_cards/releases).

**Há anúncios ou rastreadores no aplicativo?**  
Não. O aplicativo é totalmente autônomo, não contém anúncios e não usa nenhum rastreador de análise ou rastreamento.

**O aplicativo funciona sem Internet?**  
Sim, é um **aplicativo totalmente offline**. Em seu manifesto nem mesmo está presente a permissão `android.permission.INTERNET`. Todos os dados são armazenados apenas no seu dispositivo, garantindo o funcionamento mesmo em áreas sem rede (por exemplo, em subsolos de hipermercados).

---

## 🔒 Segurança e privacidade

**Onde meus dados são salvos?**  
Todos os dados (cartões, configurações, estatísticas) são armazenados localmente no banco de dados do seu dispositivo. Nenhuma informação é enviada para servidores de terceiros.

**Quais permissões o aplicativo solicita?**  
O aplicativo requer apenas uma permissão, e ela é solicitada **apenas no momento do uso**:
- `android.permission.CAMERA` — necessária exclusivamente para escanear cartões físicos através da câmera. Se você adicionar cartões manualmente ou a partir da galeria, esta permissão não será necessária.

---

## 💳 Uso e funcionalidades

**Como adicionar um novo cartão?**  
Existem três maneiras:
1. **Manualmente:** inserir o nome da loja, número do cartão e selecionar o formato do código de barras.
2. **Escaneamento:** tocar no botão na seção "Número do cartão" com o ícone de código QR e apontar a câmera para o cartão físico (usando ML Kit para reconhecimento rápido).
3. **A partir de arquivo:** tocar no botão na seção "Número do cartão" e selecionar uma imagem salva do código de barras da galeria ou do gerenciador de arquivos.

**Como adicionar rapidamente vários cartões?**  
- **Botão "Salvar e adicionar outro" (`+`):** na tela de criação/edição do cartão, ao lado do botão "Salvar", há um botão quadrado `+`. Ele salva o cartão atual e prepara o formulário para o próximo — mantendo a loja, cor, ícone e formato pré-preenchidos, posicionando o cursor no final do código e reiniciando a data e as visualizações.
- **Recurso "Criar uma cópia…":** mantenha pressionado qualquer cartão na lista principal (menu de contexto) e selecione **"Criar uma cópia…"**. Isso abre o formulário pré-preenchido para um salvamento rápido.
- **Importação em lote de arquivo:** em *Configurações → Importar*, você pode carregar um arquivo de lista de cartões (`JSON` ou `CSV`).

**Quais formatos de código de barras são suportados?**  
O aplicativo gera e reconhece: `QR_CODE`, `CODE_128`, `EAN_13`, `EAN_8`, `UPC_A`, `CODE_39`, `PDF_417`, `AZTEC`. Também há o modo `PHONE` para cartões onde o desconto é concedido apenas pelo número de telefone (exibido em texto grande, sem gerar código de barras).

**O que fazer se o código de barras não for lido corretamente? Como fazer para que o caixa leia facilmente o código de barras da tela?**  
- Toque no código de barras no cartão: ele abrirá **em tela cheia** com brilho máximo, fundo branco e girará automaticamente 90° (em orientação retrato) para um escaneamento perfeito.
- Nas configurações, é possível ativar «Mostrar brilho no cartão» para regular o brilho com um controle deslizante direto na tela do cartão.
- Você também pode tocar no botão **«Compartilhar imagem do código de barras»** para enviar uma imagem PNG do código de barras com margens brancas para um aplicativo de mensagens (por exemplo, se estiver comprando algo através de um entregador ou amigo).

**Como acelerar o aplicativo em um dispositivo fraco?**  
Nas configurações, ative o **«Modo de lista compacta»**. Isso desativará a renderização de códigos de barras e números de cartão na tela principal, reduzindo a altura dos itens da lista pela metade e acelerando consideravelmente o carregamento e a rolagem.

**É possível adicionar notas ou código CVC ao cartão?**  
Sim, ao editar um cartão você pode adicionar uma nota livre, bem como um campo para o código CVC/CVV (por exemplo, para resgate de pontos de bônus).

---

## 💾 Backup e transferência de dados

**Como criar uma cópia de segurança dos cartões?**  
Acesse Configurações → Exportar. Você pode salvar todos os dados no formato **JSON** (estrutura completa de dados, recomendado) ou **CSV** (tabela conveniente para visualização no Excel).

**Como transferir cartões para um novo celular?**  
1. No dispositivo antigo, exporte os cartões para um arquivo (JSON ou CSV).
2. Transfira este arquivo para o novo dispositivo (via Bluetooth, aplicativo de mensagens, nuvem ou USB).
3. No novo dispositivo, abra o arquivo através do gerenciador de arquivos. O aplicativo interceptará automaticamente a ação e proporá a importação dos cartões.

**O que significam os modos de importação?**  
- **Mesclar (MERGE):** adiciona cartões do arquivo aos já existentes no aplicativo.
- **Substituir (OVERWRITE):** exclui completamente todos os cartões atuais e os substitui pelos dados do arquivo.
- *Em caso de coincidência de cartões* (por número e nome), você pode escolher uma estratégia: atualizar existentes, adicionar como novos duplicados ou ignorá-los.

---

## 🧩 Widgets e organização

**É possível mostrar um cartão sem abrir o aplicativo?**  
Sim. Adicione o widget do DiscountCards à tela inicial. Ele suporta tamanhos de 1×1 a 5×5, exibe o código de barras e o nome da loja, e ao ser tocado abre instantaneamente o cartão completo.

**Como manter a ordem se houver cartões demais?**  
- Use os **Favoritos** (⭐️) para cartões usados com frequência, para que fiquem no topo da lista.
- Use o **Arquivo**: mova para lá cartões não usados ou vencidos. Eles desaparecerão da lista principal, da busca e da exportação, mas não serão excluídos permanentemente. Eles sempre podem ser restaurados.
- Exclua o cartão se tiver certeza de que não precisará mais dele.

**É possível personalizar a aparência dos cartões?**  
Sim. Para cada cartão você pode escolher um ícone de categoria, uma cor da paleta ou definir um código HEX exato (`#RRGGBB`). Também há suporte para os temas claro, escuro e do sistema.

---

## 🛠 Solução de problemas

**O leitor do caixa não lê o código de barras da minha tela. O que fazer?**  
1. Certifique-se de que o **formato do código de barras** correto foi selecionado ao criar o cartão (por exemplo, para a maioria dos cartões de supermercado é `EAN_13`).
2. Use o modo de tela cheia do código de barras (toque nele no cartão) para garantir 100% de brilho e fundo branco.
3. Limpe a tela de impressões digitais e marcas de gordura.

**O aplicativo não consegue escanear meu cartão físico com a câmera.**  
- Certifique-se de ter concedido permissão de acesso à câmera ao aplicativo (solicitada ao tocar pela primeira vez no botão do leitor).
- Forneça boa iluminação e mantenha a câmera paralela ao código de barras a uma distância de 10 a 20 cm.
- Se o código de barras estiver danificado ou a câmera não conseguir ler, use a função **«Selecionar a partir de arquivo»**, tendo fotografado previamente o cartão com a câmera padrão do celular.

**Como alterar o idioma do aplicativo?**  
Nas configurações do aplicativo há uma opção separada «Idioma». Você pode escolher um dos 12 idiomas suportados (Russo, English, Deutsch, Français, Español, Português, Italiano, 日本語, 简体中文, العربية, Türkçe, हिन्दी) independentemente do idioma do sistema do seu smartphone.

---

*Se você não encontrou a resposta para sua pergunta, você pode criar um novo tópico na seção de [Issues](https://github.com/Storvild/android_discount_cards/issues) no GitHub do projeto.*
