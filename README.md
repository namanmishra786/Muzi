<h1 align="center">🎵 Muzi - Music Voting & Collaboration App</h1>

<p align="center">
  Muzi is a real-time <strong>music collaboration platform</strong> where users can <strong>create groups</strong>, 
  <strong>add songs</strong>, <strong>vote on them</strong>, and <strong>play them using YouTube</strong>.
</p>

---

<h2>🚀 Features</h2>
<ul>
  <li>✅ <strong>User Authentication (JWT-based)</strong></li>
  <li>✅ <strong>Create & Join Music Groups</strong></li>
  <li>✅ <strong>Add Songs to Groups</strong></li>
  <li>✅ <strong>Upvote & Downvote Songs</strong></li>
  <li>✅ <strong>Real-time Updates using Polling</strong></li>
  <li>✅ <strong>Embedded YouTube Player for Song Playback</strong></li>
</ul>

---

<h2>🛠️ Tech Stack</h2>
<ul>
  <li><strong>Frontend:</strong> React, Vite, React Router, Axios</li>
  <li><strong>Backend:</strong> Spring Boot, Java, Spring Security, JWT</li>
  <li><strong>Database:</strong> H2 (for development), MySQL (for production)</li>
</ul>

---

<h2>📌 Installation Guide</h2>

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

---

<h2>🌐 API Endpoints</h2>

<h3>Authentication</h3>
<ul>
  <li><code>POST /api/auth/register</code> → <strong>Register a new user</strong></li>
  <li><code>POST /api/auth/login</code> → <strong>Login & get JWT token</strong></li>
</ul>

<h3>Groups & Songs</h3>
<ul>
  <li><code>GET /api/groups</code> → <strong>Fetch all groups</strong></li>
  <li><code>POST /api/groups</code> → <strong>Create a new group</strong></li>
  <li><code>POST /api/groups/{groupId}/songs</code> → <strong>Add a song to a group</strong></li>
  <li><code>PUT /api/groups/{groupId}/songs/{songId}/vote</code> → <strong>Vote on a song</strong></li>
</ul>

---

<h2>🛡️ Authentication (JWT Token)</h2>
<p>For protected routes, include the <strong>JWT token</strong> in headers:</p>
<pre>
Authorization: Bearer YOUR_ACCESS_TOKEN
</pre>

---

<h2>🎮 User Flow</h2>
<ol>
  <li><strong>User registers or logs in.</strong></li>
  <li><strong>They create or join a music group.</strong></li>
  <li><strong>Users add songs (with YouTube links).</strong></li>
  <li><strong>Other users vote on songs (upvote/downvote).</strong></li>
  <li><strong>The most voted song is played via the YouTube Player.</strong></li>
</ol>

---

<h2>🤝 Contribute</h2>
<p>Want to improve Muzi? <strong>Fork the repo, create a PR</strong>, or open an issue!</p>

---

<h2>📧 Contact</h2>
<p>📩 Email: <a href="mailto:your-email@example.com">your-email@example.com</a></p>

<h3 align="center">🚀 Happy Coding & Enjoy Music! 🎵</h3>
