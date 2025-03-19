<title>Muzi - README</title>
<style>
body { font-family: Arial, sans-serif; margin: 40px; padding: 20px; background-color: #f8f9fa; color: #333; }
h1, h2, h3 { color: #222; border-bottom: 2px solid #ddd; padding-bottom: 5px; }
code { background-color: #e3e3e3; padding: 2px 6px; border-radius: 4px; }
pre { background: #272822; color: #f8f8f2; padding: 10px; border-radius: 5px; overflow-x: auto; }
.container { max-width: 900px; margin: auto; background: white; padding: 25px; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }
.section { margin-bottom: 30px; }
.btn { display: inline-block; padding: 10px 15px; color: white; background: #007bff; text-decoration: none; border-radius: 5px; }
.btn:hover { background: #0056b3; }
</style>

<div class="container">
    <h1>🎵 Muzi - Music Voting & Collaboration App</h1>
    <p><strong>Muzi</strong> is a real-time platform where users can create music groups, add songs via YouTube links, vote on them, and enjoy playback—all in a collaborative, social environment.</p>

    <div class="section">
        <h2>🚀 Features</h2>
        <ul>
            <li>User Authentication (JWT-based)</li>
            <li>Create and Join Music Groups</li>
            <li>Add Songs with YouTube Links</li>
            <li>Upvote/Downvote Songs</li>
            <li>Real-time Updates via Polling</li>
            <li>Embedded YouTube Player for Playback</li>
        </ul>
    </div>

    <div class="section">
        <h2>🛠️ Tech Stack</h2>
        <ul>
            <li><strong>Frontend:</strong> React, Vite, React Router, Axios</li>
            <li><strong>Backend:</strong> Java, Spring Boot, Spring Security, JWT</li>
            <li><strong>Database:</strong> H2 (Development), MySQL (Production)</li>
        </ul>
    </div>

    <div class="section">
        <h2>📌 Installation</h2>
        <p>Follow these steps to set up Muzi locally.</p>

        <h3>1. Backend (Spring Boot)</h3>
        <pre>
# Clone the repository
git clone https://github.com/your-repo/muzi.git
cd muzi

# Build and run the backend
mvn clean install
mvn spring-boot:run
        </pre>
        <p>Backend runs on <code>http://localhost:8080</code> by default.</p>

        <h3>2. Frontend (React + Vite)</h3>
        <pre>
# Navigate to frontend directory
cd muzi-frontend

# Install dependencies
npm install

# Start the development server
npm run dev
        </pre>
        <p>Frontend runs on <code>http://localhost:5173</code> (check terminal for exact port).</p>
    </div>

    <div class="section">
        <h2>🌐 API Endpoints</h2>
        <h3>Authentication</h3>
        <ul>
            <li><code>POST /api/auth/register</code> - Register a new user</li>
            <li><code>POST /api/auth/login</code> - Log in and receive JWT token</li>
        </ul>
        <h3>Music Groups & Songs</h3>
        <ul>
            <li><code>GET /api/groups</code> - List all groups</li>
            <li><code>POST /api/groups</code> - Create a new group</li>
            <li><code>POST /api/groups/{groupId}/songs</code> - Add a song to a group</li>
            <li><code>PUT /api/groups/{groupId}/songs/{songId}/vote</code> - Upvote/downvote a song</li>
        </ul>
    </div>

    <div class="section">
        <h2>🛡️ Authentication</h2>
        <p>Secure endpoints require a JWT token in the request header:</p>
        <pre>
Authorization: Bearer &lt;your-jwt-token&gt;
        </pre>
    </div>

    <div class="section">
        <h2>🎮 How It Works</h2>
        <ol>
            <li>Register or log in to your account.</li>
            <li>Create a new music group or join an existing one.</li>
            <li>Add songs using YouTube links.</li>
            <li>Vote on songs with upvotes or downvotes.</li>
            <li>Play the top-voted song via the embedded YouTube player.</li>
        </ol>
    </div>

    <div class="section">
        <h2>🎬 Demo</h2>
        <p>See Muzi in action: <a href="https://your-demo-link.com" target="_blank" class="btn">Watch Demo</a></p>
    </div>

    <div class="section">
        <h2>🤝 Contributing</h2>
        <p>Contributions are welcome! Fork the repo, make your changes, and submit a pull request.</p>
    </div>

    <div class="section">
        <h2>📧 Contact</h2>
        <p>For questions or feedback: <a href="mailto:your-email@example.com">your-email@example.com</a></p>
    </div>

    <p><strong>🎵 Code, Collaborate, and Enjoy the Music! 🚀</strong></p>
</div>
