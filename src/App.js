import './App.css';
import Header from './components/header';
import Footer from './components/footer';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import { NavbarAccueil } from './components/navbarAccueil';

const Home = () => <h2>Accueil</h2>;
const Contact = () => <h2>Contact</h2>;
const About = () => <h2>A propos</h2>;

function App() {
  return (
    <Router>
    <Header>
        <NavbarAccueil>
        <Route exact path="/" component={Home} />
        <Route path="/contact" component={Contact} />
        <Route path="/about" component={About} />
        </NavbarAccueil>
        </Header>
    <div className="App">
        <section className="hero">
        <h2>Connectez-vous avec votre mentor idéal</h2>
        <p>Une plateforme pour mettre en relation parrains et porteurs de projet.</p>
        <button>Commencez maintenant</button>
      </section>
      <section className="features">
        <div className="feature-card">
          <h3>Trouver un mentor</h3>
          <p>Recherchez et connectez-vous avec des mentors expérimentés.</p>
        </div>
        <div className="feature-card">
          <h3>Créer un projet</h3>
          <p>Développez et présentez votre projet à des mentors potentiels.</p>
        </div>
        <div className="feature-card">
          <h3>Suivi des progrès</h3>
          <p>Suivez l'évolution de votre projet avec l'aide de votre mentor.</p>
        </div>
      </section>
      <section className="testimonials">
        <h2>Témoignages</h2>
        <p>"Cette plateforme m'a aidé à trouver le mentor parfait pour mon projet!" - Jean Dupont</p>
        <p>"Un excellent moyen de partager mon expérience et d'aider les nouveaux entrepreneurs." - Marie Curie</p>
      </section>
      <Footer></Footer>
    </div>
  </Router>
  );
}

export default App;
