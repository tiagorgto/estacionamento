/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estacionamento;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author rgto777
 */
@Entity
public class Estacionar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    @JoinColumn(name="veiculo_id")
    private Veiculo veiculo;
    
    @OneToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dia = new Date();
    
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hora_entrada = new Date();
    
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hora_saida = new Date();

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Date hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public Date getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(Date hora_saida) {
        this.hora_saida = hora_saida;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    
    
        //Retorna Placa
        public String getPlaca(){
            return veiculo.getPlaca();
        }
        
        //Retorna Modelo
        public String getModelo() {
        return veiculo.getModelo();
    }
        //Retorna nome
        public String getNome(){
            return cliente.getNome();
        }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estacionar)) {
            return false;
        }
        Estacionar other = (Estacionar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "estacionamento.Estacionar[ id=" + id + " ]";
    }
    
}
