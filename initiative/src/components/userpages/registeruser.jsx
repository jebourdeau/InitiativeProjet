import "../../styles/login.css";

export const Registeruser = () => {
    return (
        <div>
            <h3>Vous n'avez pas de compte, créer le maintenant</h3>
            <form className="login-case">
                <label title="Nom">Nom</label>
                <input type='text' name='Nom' placeholder='Nom'/>

                <label title="Prenom">Prénom</label>
                <input type='text' name='prénom' placeholder='Prénom'/>

                <label title="Identifiant">Identifiant</label>
                <input type='text' name='Identifiant' placeholder='Identifiant'/>

                <label title="Email">Email</label>
                <input type='text' name='Email' placeholder='Email'/>

                <label title="mot_de_passe">Mot de Passse</label>
                <input type='text' name='Mot de passe' placeholder='Password'/>
                <br></br>
                <label title="Confirme_mot_de_passe">Confirme mot de passe</label>
                <input type='text' name='confirme password' placeholder='Confirmation'/>

                <input type='submit' className='button_submit'></input>
            </form>
        </div>
    );
};
