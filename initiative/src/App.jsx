
import './App.css';
import Header from './components/structure/header';
import Footer from './components/structure/footer';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Contact } from './components/pages/contact';
import { Home } from './components/pages/home';
import { Apropos } from './components/pages/apropos';
import { Loginparrain } from './components/parrainpages/loginparrain';
import { RegisterParrain } from './components/parrainpages/registerParrain';
import Boite_à_outils from './components/pages/boitesOutils/boite_à_outils';
import { Outils } from './components/pages/boitesOutils/outils';
import { Photos } from './components/pages/boitesOutils/photos';
import Rendezvous from './components/pages/boitesOutils/rendezvous';



function App() {
  return (
    <BrowserRouter>
    <Header/>
    <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/contact" element={<Contact/>} />
        <Route path="/apropos" element={<Apropos/>} />
        <Route path="/login" element={<Loginparrain/>} />
        <Route path="/register" element={<RegisterParrain/>} />
        <Route path="/boites-outils" element={<Boite_à_outils/>} />
        <Route path="/outils" element={<Outils/>} />
        <Route path="/photos" element={<Photos/>} />
        <Route path="/rendezvous" element={<Rendezvous/>} />
        
    </Routes>
    <Footer/>
  </BrowserRouter>
  );
}

export default App;
