package com.gentalha.motiveme.feature.quote.cache

import com.gentalha.motiveme.feature.quote.presentation.model.QuoteModel
import com.google.gson.Gson

object QuoteCache {
    val json = """
        [
    {
      "message": "A jornada mais importante é aquela que você faz em direção a si mesmo.",
      "author": "Steve Maraboli",
      "hashtags": [
        "autoconhecimento",
        "crescimento",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "Cultive gratidão e colha alegria em cada momento.",
      "author": "Autor desconhecido",
      "hashtags": [
        "gratidão",
        "felicidade",
        "apreciarVida"
      ]
    },
    {
      "message": "Acredite na sua força interior. Você é capaz de superar qualquer desafio.",
      "author": "Autor desconhecido",
      "hashtags": [
        "forçaInterior",
        "perseverança",
        "superação"
      ]
    },
    {
      "message": "Seja a mudança que você deseja ver no mundo.",
      "author": "Mahatma Gandhi",
      "hashtags": [
        "transformação",
        "inspiração",
        "liderança"
      ]
    },
    {
      "message": "Acredite, você é capaz de alcançar coisas extraordinárias!",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "sucesso",
        "potencial"
      ]
    },
    {
      "message": "A vida é curta demais para desperdiçar com coisas que não nos fazem felizes.",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "prioridades",
        "aproveitarVida"
      ]
    },
    {
      "message": "Você nunca sabe que resultados virão da sua ação. Mas se você não fizer nada, não existirão resultados.",
      "author": "Mahatma Gandhi",
      "hashtags": [
        "ação",
        "perseverança",
        "resultados"
      ]
    },
    {
      "message": "Faça o que ama e ame o que faz.",
      "author": "Autor desconhecido",
      "hashtags": [
        "paixão",
        "realização",
        "propósito"
      ]
    },
    {
      "message": "Acredite em si mesmo e não haverá limites para suas realizações.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "sucesso",
        "determinação"
      ]
    },
    {
      "message": "O poder de mudar está dentro de você. Acredite e comece agora.",
      "author": "Autor desconhecido",
      "hashtags": [
        "mudança",
        "autotransformação",
        "determinação"
      ]
    },
    {
      "message": "A vida é um presente. Desembrulhe-o com gratidão.",
      "author": "Autor desconhecido",
      "hashtags": [
        "gratidão",
        "viverBem",
        "apreciarVida"
      ]
    },
    {
      "message": "Acredite em si mesmo e não deixe que o medo te impeça de seguir em frente.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "coragem",
        "perseverança"
      ]
    },
    {
      "message": "Não desista só porque é difícil. Vale a pena!",
      "author": "Autor desconhecido",
      "hashtags": [
        "perseverança",
        "determinação",
        "sucesso"
      ]
    },
    {
      "message": "A vida é muito curta para viver o sonho de outra pessoa.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autenticidade",
        "propósito",
        "realização"
      ]
    },
    {
      "message": "Você é o responsável pela sua própria felicidade. Faça acontecer!",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "autodeterminação",
        "positividade"
      ]
    },
    {
      "message": "Não se preocupe com o que os outros pensam. Faça o que te faz feliz.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autenticidade",
        "felicidade",
        "autoaceitação"
      ]
    },
    {
      "message": "O maior poder está em acreditar em si mesmo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "determinação",
        "sucesso"
      ]
    },
    {
      "message": "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
      "author": "Robert Collier",
      "hashtags": [
        "sucesso",
        "persistência",
        "determinação"
      ]
    },
    {
      "message": "A mudança começa quando você se desafia a sair da sua zona de conforto.",
      "author": "Autor desconhecido",
      "hashtags": [
        "mudança",
        "crescimento",
        "superação"
      ]
    },
    {
      "message": "As melhores coisas da vida são simples. Aproveite cada momento.",
      "author": "Autor desconhecido",
      "hashtags": [
        "simplicidade",
        "felicidade",
        "apreciarVida"
      ]
    },
    {
      "message": "Você é a única pessoa que pode limitar seu próprio crescimento.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autodesenvolvimento",
        "autolimitação",
        "crescimento"
      ]
    },
    {
      "message": "Acredite no seu potencial e vá em frente sem medo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "coragem",
        "determinação"
      ]
    },
    {
      "message": "O sucesso é a soma de pequenas ações realizadas com consistência.",
      "author": "Autor desconhecido",
      "hashtags": [
        "sucesso",
        "persistência",
        "dedicação"
      ]
    },
    {
      "message": "Não busque a felicidade fora de você. Ela está dentro do seu coração.",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "autodescoberta",
        "pazInterior"
      ]
    },
    {
      "message": "Acredite no poder dos seus sonhos. Eles têm o potencial de se tornar realidade.",
      "author": "Autor desconhecido",
      "hashtags": [
        "sonhos",
        "visualização",
        "determinação"
      ]
    },
    {
      "message": "A verdadeira liberdade é ser quem você realmente é.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autenticidade",
        "liberdade",
        "autoaceitação"
      ]
    },
    {
      "message": "A vida é uma jornada de aprendizado contínuo. Aproveite cada lição.",
      "author": "Autor desconhecido",
      "hashtags": [
        "aprendizado",
        "crescimento",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "Você é capaz de voar alto quando acredita no seu potencial.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "potencial",
        "realização"
      ]
    },
    {
      "message": "Livre-se do que não te faz bem e abra espaço para o que te faz feliz.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autocuidado",
        "felicidade",
        "bemEstar"
      ]
    },
    {
      "message": "Acredite na sua capacidade de transformar desafios em oportunidades.",
      "author": "Autor desconhecido",
      "hashtags": [
        "resiliência",
        "oportunidades",
        "superação"
      ]
    },
    {
      "message": "Você é a soma das suas escolhas. Escolha sabiamente.",
      "author": "Autor desconhecido",
      "hashtags": [
        "responsabilidade",
        "autodeterminação",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "Não se preocupe em ser perfeito. Seja autêntico e verdadeiro.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autenticidade",
        "autoaceitação",
        "crescimento"
      ]
    },
    {
      "message": "Acredite na sua capacidade de superar adversidades. Você é mais forte do que imagina.",
      "author": "Autor desconhecido",
      "hashtags": [
        "forçaInterior",
        "resiliência",
        "superação"
      ]
    },
    {
      "message": "Aproveite o poder do agora. O presente é o momento de criar o futuro.",
      "author": "Autor desconhecido",
      "hashtags": [
        "momentoPresente",
        "criatividade",
        "construção"
      ]
    },
    {
      "message": "A vida é uma tela em branco. Pinte-a com as cores dos seus sonhos.",
      "author": "Autor desconhecido",
      "hashtags": [
        "criatividade",
        "realização",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "Cultive a gratidão e enxergue a beleza nas pequenas coisas.",
      "author": "Autor desconhecido",
      "hashtags": [
        "gratidão",
        "apreciação",
        "felicidade"
      ]
    },
    {
      "message": "Não importa onde você está hoje. O que importa é para onde você está indo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "foco",
        "objetivos",
        "caminhoParaSucesso"
      ]
    },
    {
      "message": "O caminho para o sucesso começa com um primeiro passo corajoso.",
      "author": "Autor desconhecido",
      "hashtags": [
        "coragem",
        "iniciar",
        "determinação"
      ]
    },
    {
      "message": "Acredite na sua capacidade de enfrentar desafios e vencer obstáculos.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "resiliência",
        "superação"
      ]
    },
    {
      "message": "Não tenha medo de errar. O fracasso é uma oportunidade para aprender e crescer.",
      "author": "Autor desconhecido",
      "hashtags": [
        "aprendizado",
        "crescimento",
        "superação"
      ]
    },
    {
      "message": "A vida é cheia de oportunidades. Esteja aberto para recebê-las.",
      "author": "Autor desconhecido",
      "hashtags": [
        "oportunidades",
        "abertura",
        "positividade"
      ]
    },
    {
      "message": "Acredite na sua capacidade de tornar o impossível possível.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "determinação",
        "realização"
      ]
    },
    {
      "message": "Não se preocupe com o que você não pode controlar. Concentre-se naquilo que pode.",
      "author": "Autor desconhecido",
      "hashtags": [
        "controle",
        "foco",
        "pazInterior"
      ]
    },
    {
      "message": "A mudança começa com uma decisão. Decida mudar e siga em frente.",
      "author": "Autor desconhecido",
      "hashtags": [
        "mudança",
        "decisão",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "Acredite na sua capacidade de vencer. A vitória começa na sua mente.",
      "author": "Autor desconhecido",
      "hashtags": [
        "mentalidadeVencedora",
        "autoconfiança",
        "sucesso"
      ]
    },
    {
      "message": "A gratidão é a chave para abrir o coração e atrair coisas boas para a vida.",
      "author": "Autor desconhecido",
      "hashtags": [
        "gratidão",
        "positividade",
        "abundância"
      ]
    },
    {
      "message": "Não deixe que o medo de falhar te impeça de tentar. O sucesso requer tentativas.",
      "author": "Autor desconhecido",
      "hashtags": [
        "coragem",
        "perseverança",
        "sucesso"
      ]
    },
    {
      "message": "Acredite em si mesmo e não permita que a opinião dos outros te defina.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "autenticidade",
        "autoaceitação"
      ]
    },
    {
      "message": "A vida é uma jornada de autodescoberta. Explore-se e seja você mesmo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconhecimento",
        "autodesenvolvimento",
        "autenticidade"
      ]
    },
    {
      "message": "A persistência é a chave para superar qualquer obstáculo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "persistência",
        "determinação",
        "superação"
      ]
    },
    {
      "message": "Acredite na sua capacidade de dar a volta por cima em qualquer situação.",
      "author": "Autor desconhecido",
      "hashtags": [
        "forçaInterior",
        "resiliência",
        "superação"
      ]
    },
    {
      "message": "A felicidade está no presente. Aproveite o aqui e agora.",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "momentoPresente",
        "gratidão"
      ]
    },
    {
      "message": "Nunca é tarde demais para perseguir seus sonhos. Acredite em si mesmo!",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "realização",
        "perseguirSonhos"
      ]
    },
    {
      "message": "Acredite no poder das suas escolhas. Elas moldam o seu destino.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autodeterminação",
        "responsabilidade",
        "crescimento"
      ]
    },
    {
      "message": "Acredite em si mesmo. Você é capaz de coisas incríveis!",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "motivação",
        "positividade"
      ]
    },
    {
      "message": "A maior glória em viver não está em nunca cair, mas em nos levantarmos toda vez que caímos.",
      "author": "Nelson Mandela",
      "hashtags": [
        "resiliência",
        "superar",
        "perseverança"
      ]
    },
    {
      "message": "A felicidade está na jornada, não no destino final.",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "gratidão",
        "apreciar"
      ]
    },
    {
      "message": "Nunca é tarde demais para ser aquilo que sempre desejou ser.",
      "author": "George Eliot",
      "hashtags": [
        "realização",
        "sonhos",
        "autoconhecimento"
      ]
    },
    {
      "message": "O otimismo é a fé em ação. Nada se pode levar a efeito sem otimismo.",
      "author": "Helen Keller",
      "hashtags": [
        "otimismo",
        "fé",
        "proatividade"
      ]
    },
    {
      "message": "Você é o criador da sua própria realidade. Acredite, visualize, manifeste!",
      "author": "Autor desconhecido",
      "hashtags": [
        "leiDaAtração",
        "visualização",
        "manifestação"
      ]
    },
    {
      "message": "Seja a mudança que você quer ver no mundo.",
      "author": "Mahatma Gandhi",
      "hashtags": [
        "inspiração",
        "transformação",
        "liderança"
      ]
    },
    {
      "message": "A persistência é o caminho do êxito.",
      "author": "Charles Chaplin",
      "hashtags": [
        "persistência",
        "sucesso",
        "dedicação"
      ]
    },
    {
      "message": "Ame a si mesmo em primeiro lugar e o resto se encaixará.",
      "author": "Lucille Ball",
      "hashtags": [
        "amorPróprio",
        "equilíbrio",
        "autoestima"
      ]
    },
    {
      "message": "Cada dia é uma nova chance para ser feliz.",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "oportunidade",
        "gratidão"
      ]
    },
    {
      "message": "A força não vem de vencer. Suas lutas desenvolvem suas forças. Quando você atravessa dificuldades e decide não se render, isso é força.",
      "author": "Arnold Schwarzenegger",
      "hashtags": [
        "forçaInterior",
        "superarDesafios",
        "determinação"
      ]
    },
    {
      "message": "Acredite no seu potencial e não limite suas ambições.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "autoestima",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "Não espere por oportunidades. Crie-as.",
      "author": "Autor desconhecido",
      "hashtags": [
        "oportunidades",
        "criatividade",
        "empreendedorismo"
      ]
    },
    {
      "message": "Quando você quer alguma coisa, todo o Universo conspira para que você realize seu desejo.",
      "author": "Paulo Coelho",
      "hashtags": [
        "leiDaAtração",
        "destino",
        "manifestação"
      ]
    },
    {
      "message": "A vida é como andar de bicicleta. Para manter o equilíbrio, você precisa continuar em movimento.",
      "author": "Albert Einstein",
      "hashtags": [
        "equilíbrio",
        "progresso",
        "crescimento"
      ]
    },
    {
      "message": "Você não é derrotado quando perde. Você é derrotado quando desiste.",
      "author": "Dr. House",
      "hashtags": [
        "perseverança",
        "determinação",
        "vencerDesafios"
      ]
    },
    {
      "message": "Nunca é tarde para ser aquilo que sempre se desejou ser.",
      "author": "George Eliot",
      "hashtags": [
        "autoconhecimento",
        "autoestima",
        "realização"
      ]
    },
    {
      "message": "A única limitação que você tem é aquela que você coloca em sua própria mente.",
      "author": "Napoleon Hill",
      "hashtags": [
        "mentePoderosa",
        "autolimitação",
        "potencial"
      ]
    },
    {
      "message": "A vida é um eco. Se você não está gostando do que está recebendo, observe o que está emitindo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "leiDaAtração",
        "positividade",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "Não tenha medo do fracasso. Tenha medo de não tentar.",
      "author": "Autor desconhecido",
      "hashtags": [
        "coragem",
        "perseverança",
        "superação"
      ]
    },
    {
      "message": "O poder está dentro de você, na sua mente, pois se acreditar que consegue não haverá obstáculo capaz de impedir.",
      "author": "Autor desconhecido",
      "hashtags": [
        "poderMental",
        "superarObstáculos",
        "autodeterminação"
      ]
    },
    {
      "message": "Você é o arquiteto de sua própria vida. Construa-a com sabedoria.",
      "author": "Autor desconhecido",
      "hashtags": [
        "construirFuturo",
        "autodeterminação",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "Lembre-se, toda montanha é vencida passo a passo. Não desista!",
      "author": "Autor desconhecido",
      "hashtags": [
        "perseverança",
        "superarDesafios",
        "progresso"
      ]
    },
    {
      "message": "Quando sentir vontade de desistir, lembre-se de tudo que já enfrentou e siga em frente!",
      "author": "Autor desconhecido",
      "hashtags": [
        "perseverança",
        "forçaInterior",
        "superação"
      ]
    },
    {
      "message": "A vida é feita de escolhas. Escolha ser feliz!",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "atitudePositiva",
        "vidaPlena"
      ]
    },
    {
      "message": "Não perca tempo invejando o sucesso dos outros. Concentre-se na sua própria jornada.",
      "author": "Autor desconhecido",
      "hashtags": [
        "foco",
        "autodesenvolvimento",
        "crescimento"
      ]
    },
    {
      "message": "O que você pensa, você se torna. O que você sente, você atrai. O que você imagina, você cria.",
      "author": "Buda",
      "hashtags": [
        "pensamentoPositivo",
        "atrairBoasEnergias",
        "visualização"
      ]
    },
    {
      "message": "Para ser insubstituível, você precisa ser sempre diferente.",
      "author": "Coco Chanel",
      "hashtags": [
        "autenticidade",
        "originalidade",
        "unicidade"
      ]
    },
    {
      "message": "A felicidade não é um destino a ser alcançado, mas uma jornada a ser vivida.",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "viverBem",
        "gratidão"
      ]
    },
    {
      "message": "Acredite que você pode e você já está no meio do caminho.",
      "author": "Theodore Roosevelt",
      "hashtags": [
        "autoconfiança",
        "determinação",
        "sucesso"
      ]
    },
    {
      "message": "A vida é um presente. Abrace-a com gratidão.",
      "author": "Autor desconhecido",
      "hashtags": [
        "gratidão",
        "apreciarVida",
        "bênçãos"
      ]
    },
    {
      "message": "Não deixe o medo decidir o que você faz da sua vida.",
      "author": "Autor desconhecido",
      "hashtags": [
        "coragem",
        "autoconfiança",
        "superação"
      ]
    },
    {
      "message": "O segredo para ser feliz é aceitar onde você está na vida e aproveitar ao máximo todos os dias.",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "aceitação",
        "aproveitarVida"
      ]
    },
    {
      "message": "Não se preocupe em ser notado, faça algo significativo para ser lembrado.",
      "author": "Autor desconhecido",
      "hashtags": [
        "significado",
        "legado",
        "realizações"
      ]
    },
    {
      "message": "A sua vida é um reflexo das suas escolhas. Se você quer um resultado diferente, faça escolhas diferentes.",
      "author": "Autor desconhecido",
      "hashtags": [
        "responsabilidade",
        "autodeterminação",
        "mudança"
      ]
    },
    {
      "message": "Nunca é tarde demais para ser quem você poderia ter sido.",
      "author": "George Eliot",
      "hashtags": [
        "autoconhecimento",
        "autodescoberta",
        "realização"
      ]
    },
    {
      "message": "O melhor jeito de prever o futuro é criá-lo.",
      "author": "Peter Drucker",
      "hashtags": [
        "criatividade",
        "planejamento",
        "realização"
      ]
    },
    {
      "message": "Não importa o quão devagar você vá, desde que não pare.",
      "author": "Confúcio",
      "hashtags": [
        "perseverança",
        "progresso",
        "determinação"
      ]
    },
    {
      "message": "A gratidão transforma o que temos em suficiente e mais.",
      "author": "Melody Beattie",
      "hashtags": [
        "gratidão",
        "abundância",
        "contentamento"
      ]
    },
    {
      "message": "O sucesso é construído um dia de cada vez.",
      "author": "Autor desconhecido",
      "hashtags": [
        "sucesso",
        "progresso",
        "perseverança"
      ]
    },
    {
      "message": "Acredite em si mesmo e todos os seus sonhos se tornarão realidade.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "realização",
        "autoestima"
      ]
    },
    {
      "message": "Você é mais forte do que pensa. Acredite em si mesmo!",
      "author": "Autor desconhecido",
      "hashtags": [
        "forçaInterior",
        "autoconfiança",
        "superarDesafios"
      ]
    },
    {
      "message": "Não espere o momento perfeito, comece onde você está e faça o melhor que puder.",
      "author": "Roy T. Bennett",
      "hashtags": [
        "ação",
        "iniciar",
        "caminhoParaSucesso"
      ]
    },
    {
      "message": "Aproveite cada momento, pois ele é único e precioso.",
      "author": "Autor desconhecido",
      "hashtags": [
        "viverBem",
        "gratidão",
        "apreciarVida"
      ]
    },
    {
      "message": "Nunca é tarde demais para ser o que você poderia ter sido.",
      "author": "George Eliot",
      "hashtags": [
        "autoconhecimento",
        "realização",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "A mudança é inevitável, mas o crescimento é uma escolha.",
      "author": "John C. Maxwell",
      "hashtags": [
        "mudança",
        "crescimento",
        "evolução"
      ]
    },
    {
      "message": "Faça o que você pode, com o que tem, onde está.",
      "author": "Theodore Roosevelt",
      "hashtags": [
        "ação",
        "recursos",
        "iniciar"
      ]
    },
    {
      "message": "Acredite no seu potencial e vá em frente sem medo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "coragem",
        "determinação"
      ]
    },
    {
      "message": "Não existe elevador para o sucesso, você precisa subir degrau por degrau.",
      "author": "Zig Ziglar",
      "hashtags": [
        "sucesso",
        "esforço",
        "persistência"
      ]
    },
    {
      "message": "A vida é como uma câmera. Foque no que é importante, capture bons momentos e tire o negativo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "atitude",
        "foco",
        "positividade"
      ]
    },
    {
      "message": "Não deixe que os outros limitem seus sonhos. Acredite em si mesmo e alcance o impossível.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "perseverança",
        "realização"
      ]
    },
    {
      "message": "Você é a soma das suas escolhas. Escolha sabiamente.",
      "author": "Autor desconhecido",
      "hashtags": [
        "responsabilidade",
        "autodeterminação",
        "autodesenvolvimento"
      ]
    },
    {
      "message": "O único limite para nossas realizações de amanhã são as nossas dúvidas de hoje.",
      "author": "Franklin D. Roosevelt",
      "hashtags": [
        "crenças",
        "autoconfiança",
        "sucesso"
      ]
    },
    {
      "message": "Seja a mudança que você deseja ver no mundo.",
      "author": "Mahatma Gandhi",
      "hashtags": [
        "transformação",
        "inspiração",
        "liderança"
      ]
    },
    {
      "message": "Acredite, você é capaz de alcançar coisas extraordinárias!",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "sucesso",
        "potencial"
      ]
    },
    {
      "message": "A vida é curta demais para desperdiçar com coisas que não nos fazem felizes.",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "prioridades",
        "aproveitarVida"
      ]
    },
    {
      "message": "Você nunca sabe que resultados virão da sua ação. Mas se você não fizer nada, não existirão resultados.",
      "author": "Mahatma Gandhi",
      "hashtags": [
        "ação",
        "perseverança",
        "resultados"
      ]
    },
    {
      "message": "Faça o que ama e ame o que faz.",
      "author": "Autor desconhecido",
      "hashtags": [
        "paixão",
        "realização",
        "propósito"
      ]
    },
    {
      "message": "Acredite em si mesmo e não haverá limites para suas realizações.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "sucesso",
        "determinação"
      ]
    },
    {
      "message": "O poder de mudar está dentro de você. Acredite e comece agora.",
      "author": "Autor desconhecido",
      "hashtags": [
        "mudança",
        "autotransformação",
        "determinação"
      ]
    },
    {
      "message": "A vida é um presente. Desembrulhe-o com gratidão.",
      "author": "Autor desconhecido",
      "hashtags": [
        "gratidão",
        "viverBem",
        "apreciarVida"
      ]
    },
    {
      "message": "Acredite em si mesmo e não deixe que o medo te impeça de seguir em frente.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "coragem",
        "perseverança"
      ]
    },
    {
      "message": "Não desista só porque é difícil. Vale a pena!",
      "author": "Autor desconhecido",
      "hashtags": [
        "perseverança",
        "determinação",
        "sucesso"
      ]
    },
    {
      "message": "A vida é muito curta para viver o sonho de outra pessoa.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autenticidade",
        "propósito",
        "realização"
      ]
    },
    {
      "message": "Você é o responsável pela sua própria felicidade. Faça acontecer!",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "autodeterminação",
        "positividade"
      ]
    },
    {
      "message": "Não deixe que o medo de cair o impeça de voar.",
      "author": "Autor desconhecido",
      "hashtags": [
        "coragem",
        "superação",
        "autoconfiança"
      ]
    },
    {
      "message": "A vida é um constante recomeço. Permita-se começar de novo quantas vezes for necessário.",
      "author": "Autor desconhecido",
      "hashtags": [
        "recomeço",
        "perseverança",
        "autoaceitação"
      ]
    },
    {
      "message": "Tudo o que você precisa para alcançar o sucesso está dentro de você.",
      "author": "Autor desconhecido",
      "hashtags": [
        "sucesso",
        "potencial",
        "determinação"
      ]
    },
    {
      "message": "Cada passo que dou me aproxima do meu objetivo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "progresso",
        "alcançarObjetivos",
        "determinação"
      ]
    },
    {
      "message": "Acredite que você é capaz e você já deu o primeiro passo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "sucesso",
        "determinação"
      ]
    },
    {
      "message": "A felicidade não é uma meta a ser alcançada, mas sim um estado de espírito a ser cultivado.",
      "author": "Autor desconhecido",
      "hashtags": [
        "felicidade",
        "atitude",
        "gratidão"
      ]
    },
    {
      "message": "Pare de adiar seus sonhos. A hora de agir é agora.",
      "author": "Autor desconhecido",
      "hashtags": [
        "ação",
        "realização",
        "perseverança"
      ]
    },
    {
      "message": "Não espere a motivação. Aja e a motivação virá.",
      "author": "Autor desconhecido",
      "hashtags": [
        "motivação",
        "ação",
        "realização"
      ]
    },
    {
      "message": "Seja grato pelo que tem e atraia mais motivos para agradecer.",
      "author": "Autor desconhecido",
      "hashtags": [
        "gratidão",
        "abundância",
        "positividade"
      ]
    },
    {
      "message": "Não se preocupe com o que os outros pensam. Faça o que te faz feliz.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autenticidade",
        "felicidade",
        "autoaceitação"
      ]
    },
    {
      "message": "O maior poder está em acreditar em si mesmo.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autoconfiança",
        "determinação",
        "sucesso"
      ]
    },
    {
      "message": "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
      "author": "Robert Collier",
      "hashtags": [
        "sucesso",
        "persistência",
        "determinação"
      ]
    },
    {
      "message": "A mudança começa quando você se desafia a sair da sua zona de conforto.",
      "author": "Autor desconhecido",
      "hashtags": [
        "mudança",
        "crescimento",
        "superação"
      ]
    },
    {
      "message": "As melhores coisas da vida são simples. Aproveite cada momento.",
      "author": "Autor desconhecido",
      "hashtags": [
        "simplicidade",
        "felicidade",
        "apreciarVida"
      ]
    },
    {
      "message": "Você é a única pessoa que pode limitar seu próprio crescimento.",
      "author": "Autor desconhecido",
      "hashtags": [
        "autodesenvolvimento",
        "autolimitação"
      ]
    }
  ]
    """.trimIndent()

    private val gson = Gson()
    val positiveMessages = gson.fromJson(json, Array<QuoteModel>::class.java).toList()
}