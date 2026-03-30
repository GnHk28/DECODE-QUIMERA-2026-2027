## Módulo TeamCode

Bem-vindo!

Este módulo, TeamCode, é o lugar onde você irá escrever/colar o código do aplicativo controlador do robô da sua equipe. Atualmente, este módulo está vazio (uma folha em branco), mas o processo para adicionar OpModes é simples.

---

## Criando seus próprios OpModes

A maneira mais fácil de criar seu próprio OpMode é copiar um OpMode de exemplo e adaptá-lo.

Os OpModes de exemplo estão no módulo FtcRobotController.
Para encontrá-los, localize o módulo FtcRobotController na aba "Project/Android".

Expanda os seguintes diretórios:
FtcRobotController/java/org.firstinspires.ftc.robotcontroller/external/samples

---

### Nomeação dos exemplos

Para entender melhor como os exemplos estão organizados e como interpretar o sistema de nomes, é importante conhecer as convenções usadas na criação deles.

Essas convenções são descritas em detalhes no arquivo `sample_conventions.md` nesta pasta.

Resumo:

Uma variedade de classes de exemplo está na pasta java/external/samples.
Os nomes das classes seguem um padrão que indica o propósito de cada uma.

O prefixo do nome será um dos seguintes:

**Basic:**
Um OpMode minimamente funcional usado para ilustrar a estrutura básica de um tipo específico de OpMode. São exemplos bem simples.

**Sensor:**
Um OpMode de exemplo que mostra como usar um sensor específico.
Não é feito para controlar um robô funcional, apenas para demonstrar o código mínimo necessário para ler e exibir valores do sensor.

**Robot:**
Um OpMode de exemplo que assume um robô simples com dois motores (tração diferencial).
Pode servir como base para controle ou para demonstrar o uso de sensores ou conceitos de navegação.

**Concept:**
Um OpMode que demonstra uma função ou conceito específico.
Pode ser mais complexo, mas deve ser bem explicado nos comentários ou referenciar documentação externa.
Cada OpMode tenta demonstrar apenas um conceito para facilitar a identificação.
Pode não resultar em um robô controlável.

---

Após o prefixo, outras convenções são usadas:

* Classes Sensor: **Sensor - Empresa - Tipo**
* Classes Robot: **Robot - Modo - Ação - Tipo de OpMode**
* Classes Concept: **Concept - Tópico - Tipo de OpMode**

---

Depois de entender os exemplos disponíveis, você pode escolher um como base para seu robô.
Em todos os casos, o exemplo desejado deve ser copiado para o módulo TeamCode.

Isso é feito no Android Studio seguindo os passos:

1. Localize a classe de exemplo desejada na árvore Project/Android.
2. Clique com o botão direito na classe e selecione "Copy".
3. Expanda a pasta TeamCode/java.
4. Clique com o botão direito em org.firstinspires.ftc.teamcode e selecione "Paste".
5. Escolha um nome para a nova classe.
   Use algo significativo, começando com letra maiúscula.

---

Depois de criar a cópia, prepare-a para uso no robô:

* Ajuste o nome do OpMode
* Habilite-o para aparecer na lista da Driver Station

Cada OpMode começa com algo assim:

```
@TeleOp(name="Template: Linear OpMode", group="Linear Opmode")
@Disabled
```

O nome exibido na Driver Station é definido por:

```
name="Template: Linear OpMode"
```

Você pode alterar esse nome para algo mais descritivo.

O campo `group` ajuda a organizar os OpModes.

---

⚠️ Importante:
O OpMode NÃO aparecerá na lista enquanto tiver `@Disabled`.

Para ativar:

* Delete essa linha
  ou
* Comente ela

---

## AVANÇADO: Gerenciamento de múltiplas equipes (clonar o TeamCode)

Em alguns casos, várias equipes compartilham o mesmo projeto, mas cada uma mantém seu próprio código.

Você pode clonar o módulo TeamCode para cada equipe.
Cada clone aparecerá como um módulo separado no Android Studio.

Assim, você pode selecionar qual módulo usar antes de rodar o código.

---

⚠️ Atenção:
Isso não é recomendado para iniciantes.

Você precisa:

* Saber manipular arquivos
* Entender módulos no Android Studio

Essas mudanças são feitas FORA do Android Studio, então feche o programa antes.

👉 Faça backup do projeto antes de começar!

---

### Passos para clonar o TeamCode:

1. Copie a pasta "TeamCode" e renomeie (ex: "Team0417").

2. Na nova pasta, delete o arquivo TeamCode.iml.

3. Renomeie a pasta:

```
src/main/java/org/firstinspires/ftc/teamcode
```

para:

```
team0417
```

4. Edite o arquivo AndroidManifest.xml e altere:

```
package="org.firstinspires.ftc.teamcode"
```

para:

```
package="org.firstinspires.ftc.team0417"
```

5. No arquivo settings.gradle, adicione:

```
include ':Team0417'
```

6. Abra o Android Studio e vá em:

```
Build → Clean Project
```

---

Se quiser, posso te resumir isso em um guia mais prático tipo “passo a passo para FTC” ou até adaptar pro que você vai usar com a HuskyLens 👍
