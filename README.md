<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Muzi - README</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            padding: 20px;
            background-color: #f8f9fa;
            color: #333;
        }
        h1, h2, h3 {
            color: #222;
            border-bottom: 2px solid #ddd;
            padding-bottom: 5px;
        }
        code {
            background-color: #e3e3e3;
            padding: 2px 6px;
            border-radius: 4px;
        }
        pre {
            background: #272822;
            color: #f8f8f2;
            padding: 10px;
            border-radius: 5px;
            overflow-x: auto;
        }
        .container {
            max-width: 900px;
            margin: auto;
            background: white;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .section {
            margin-bottom: 30px;
        }
        .btn {
            display: inline-block;
            padding: 10px 15px;
            color: white;
            background: #007bff;
            text-decoration: none;
            border-radius: 5px;
        }
        .btn:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>🎵 Muzi - Music Voting & Collaboration App</h1>
        <p><strong>Description:</strong> Muzi is a real-time music collaboration platform where users can create groups, add songs, vote on them, and play them using YouTube.</p>

        <div class="section">
            <h2>🚀 Features</h2>
            <ul>
                <li>✅ User Authentication (JWT-based)</li>
                <li>✅ Create & Join Music Groups</li>
                <li>✅ Add Songs to Groups</li>
                <li>✅ Upvote & Downvote Songs</li>
                <li>✅ Real-time Updates using Polling</li>
                <li>✅ Embedded YouTube Player for Song Playback</li>
            </ul>
        </div>

        <div class="section">
            <h2>🛠️ Tech Stack</h2>
            <ul>
                <li><strong>Frontend:</strong> React, Vite, React Router, Axios</li>
                <li><strong>Backend:</strong> Spring Boot, Java, Spring Security, JWT</li>
                <li><strong>Database:</strong> H2 (for development), MySQL (for production)</li>
            </ul>
        </div>

        <div class="section">
            <h2>📌 Installation</h2>

            <h3>1️⃣ Backend Setup (Spring Boot)</h3>
            <pre>
# Clone the repository
git clone https://github.com/your-repo/muzi.git
cd muzi

# Build & Run Backend
mvn clean install
mvn spring-boot:run
            </pre>

            <h3>2️⃣ Frontend Setup (React + Vite)</h3>
            <pre>
# Navigate to frontend directory
cd muzi-frontend

# Install dependencies
npm install

# Start frontend
npm run dev
            </pre>
        </div>

        <div class="section">
            <h2>🌐 API Endpoints</h2>
            <h3>Authentication</h3>
            <ul>
                <li><code>POST /api/auth/register</code> → Register a new user</li>
                <li><code>POST /api/auth/login</code> → Login & get JWT token</li>
            </ul>

            <h3>Groups & Songs</h3>
            <ul>
                <li><code>GET /api/groups</code> → Fetch all groups</li>
                <li><code>POST /api/groups</code> → Create a new group</li>
                <li><code>POST /api/groups/{groupId}/songs</code> → Add a song to a group</li>
                <li><code>PUT /api/groups/{groupId}/songs/{songId}/vote</code> → Vote on a song</li>
            </ul>
        </div>

        <div class="section">
            <h2>🛡️ Authentication (JWT Token)</h2>
            <p>All secured API requests require the JWT token in the headers:</p>
            <pre>
Authorization: Bearer YOUR_ACCESS_TOKEN
            </pre>
        </div>

        <div class="section">
            <h2>🎮 User Flow</h2>
            <ol>
                <li>🆕 User registers or logs in.</li>
                <li>🎵 They create or join a music group.</li>
                <li>🎶 Users add songs (with YouTube links).</li>
                <li>👍 Other users vote on songs (upvote/downvote).</li>
                <li>▶️ The most voted song is played via the YouTube Player.</li>
            </ol>
        </div>

        <div class="section">
            <h2>🎬 Demo Video</h2>
            <p>Watch the demo: <a href="https://your-demo-link.com" target="_blank" class="btn">Demo Link</a></p>
        </div>

        <div class="section">
            <h2>🤝 Contribution</h2>
            <p>Feel free to contribute by submitting a pull request!</p>
        </div>

        <div class="section">
            <h2>📧 Contact</h2>
            <p>Email: <a href="mailto:your-email@example.com">your-email@example.com</a></p>
        </div>

        <p><strong>🚀 Happy Coding & Enjoy Music! 🎵</strong></p>
    </div>
</body>
</html>
