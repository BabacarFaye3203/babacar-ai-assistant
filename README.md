# babacar-ai-assistant 

---

# Chatbot AI MCP Telegram Client

![me](https://github.com/user-attachments/assets/6b9b5697-414b-4c6f-aab3-9dc793ad962e)


## Description

Ce projet est un **client Telegram intelligent** intégrant **Spring AI**, **Ollama**, **MCP** et **LLaMA 3.2** pour créer un chatbot capable de :

* Spécialisé en Moi
*  Répondre à des questions en langage naturel
* Gérer des conversations contextuelles
* Exploiter des modèles LLM avancés
* S’intégrer avec Telegram pour l’interaction en temps réel

Idéal pour expérimenter l’IA conversationnelle et développer un assistant intelligent.

---

## Technologies utilisées

* **Java 21 / Spring Boot** – Backend moderne et robuste
* **Spring AI** – Framework pour l’intégration de l’IA
* **Ollama** – Interface pour gérer les modèles LLM
* **MCP (Model Control Protocol)** – Orchestration et contrôle des modèles
* **LLaMA 3.2** – Modèle de langage pour générer des réponses naturelles
* **Telegram Bot API** – Communication avec les utilisateurs

---

## Fonctionnalités

* Conversations multi-utilisateurs via Telegram
* Traitement avancé du langage naturel
* Support de plusieurs modèles LLM et basculement automatique
* Historique des conversations et logs
* Extensible pour d’autres plateformes (Web, Discord, etc.)

---

## Installation

### Prérequis

* **Java 21**
* **Maven 4+**
* Clé API Telegram Bot
* Clés API pour Spring AI et Ollama

### Étapes

1. Clone ton projet :

```bash
git clone https://github.com/TON_COMPTE/chatbot-spring-ai-mcp-telegram-client.git
cd chatbot-spring-ai-mcp-telegram-client
```

2. Installer les dépendances Maven :

```bash
mvn clean install
```

3. Configurer les clés API dans `application.properties` ou `.env` :

```properties
telegram.api.key.token=VOTRE_TELEGRAM_BOT_TOKEN
ollama.api.key=VOTRE_OLLAMA_API_KEY
```

4. Lancer l’application :

```bash
mvn spring-boot:run
```

---

## Utilisation

* `/start` → démarre la conversation
* `/help` → affiche l’aide
* Tout autre message → traité par le modèle LLaMA 3.2 via MCP

---

## Architecture
<img width="2100" height="140" alt="mermaid-diagram (1)" src="https://github.com/user-attachments/assets/5f4f15e9-07ae-41fb-b628-4849f9e61ec3" />


flowchart LR
    User[Utilisateur Telegram] -->|Message| Bot[Telegram Bot API]
    Bot --> AI[Spring AI / MCP / Ollama]
    AI --> Model[LLaMA 3.2]
    Model --> AI
    AI -->|Réponse| Bot
    Bot --> User
```

* **Spring AI** : services et orchestration
* **MCP** : contrôle le flux de messages et la sélection du modèle
* **Ollama** : communication avec LLaMA 3.2

---

## Contribution

1. Fork le projet
2. Crée une branche : `git checkout -b feature/nom-feature`
3. Commit : `git commit -m "Ajout de la fonctionnalité X"`
4. Push : `git push origin feature/nom-feature`
5. Ouvre un Pull Request

---

## License

MIT License © 2026 Babacar Faye

---




